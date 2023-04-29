package com.withus.withus_android.ui.start

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.kakao.sdk.auth.model.OAuthToken
import com.kakao.sdk.common.model.ClientError
import com.kakao.sdk.common.model.ClientErrorCause
import com.kakao.sdk.user.UserApiClient
import com.withus.withus_android.AppConsts.LOGIN_TAG_KAKAO
import com.withus.withus_android.ui.start.state.LogInState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class StartViewModel @Inject constructor() : ViewModel() {

    private val _logInState = MutableStateFlow(LogInState())
    val logInState = _logInState.asStateFlow()

    private fun setLogInResult(isSuccess: Boolean, accessToken: String, refreshToken: String) {
        _logInState.value = logInState.value.copy(
            isLoggedIn = isSuccess,
            accessToken = accessToken,
            refreshToken = refreshToken,
        )
    }

    private val callback: (OAuthToken?, Throwable?) -> Unit = { token, error ->
        if (error != null) {
            Log.e(LOGIN_TAG_KAKAO, "카카오계정으로 로그인 실패", error)
        } else if (token != null) {
            Log.i(LOGIN_TAG_KAKAO, "카카오계정으로 로그인 성공 ${token.accessToken}")
        }
    }

    fun kakao_login(context: Context) {
        if (UserApiClient.instance.isKakaoTalkLoginAvailable(context)) {
            UserApiClient.instance.loginWithKakaoTalk(context) { token, error ->
                if (error != null) {
                    Log.e(LOGIN_TAG_KAKAO, "카카오톡으로 로그인 실패", error)

                    // 사용자가 카카오톡 설치 후 디바이스 권한 요청 화면에서 로그인을 취소한 경우,
                    // 의도적인 로그인 취소로 보고 카카오계정으로 로그인 시도 없이 로그인 취소로 처리 (예: 뒤로 가기)
                    if (error is ClientError && error.reason == ClientErrorCause.Cancelled) {
                        return@loginWithKakaoTalk
                    }

                    // 카카오톡에 연결된 카카오계정이 없는 경우, 카카오계정으로 로그인 시도
                    UserApiClient.instance.loginWithKakaoAccount(context, callback = callback)
                } else if (token != null) {
                    Log.i(LOGIN_TAG_KAKAO, "카카오톡으로 로그인 성공 ${token.accessToken}")
                    setLogInResult(true, token.accessToken, token.refreshToken)
                    Log.i(LOGIN_TAG_KAKAO, "${logInState.value}")
                }
            }
        } else {
            UserApiClient.instance.loginWithKakaoAccount(context, callback = callback)
        }
    }
}
