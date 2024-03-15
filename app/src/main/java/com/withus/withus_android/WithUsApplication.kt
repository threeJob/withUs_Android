package com.withus.withus_android

import android.app.Application
import com.kakao.sdk.common.KakaoSdk
import com.withus.withus_android.BuildConfig.KAKAO_SDK_KEY
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WithUsApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        KakaoSdk.init(this, "${KAKAO_SDK_KEY}")
    }
}
