package com.withus.withus_android.ui.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.withus.withus_android.ui.components.TopBar
import com.withus.withus_android.ui.start.LogInScreen
import com.withus.withus_android.ui.start.StartViewModel

@Preview
@Composable
fun MainScreen(
    startViewModel: StartViewModel = hiltViewModel(),
) {
    val logInState = startViewModel.logInState.collectAsState()
    Log.d("COLOR", "${MaterialTheme.colorScheme.background}")
    if (logInState.value.isLoggedIn.not()) {
        LogInScreen()
    } else {
        Column(
            Modifier
                .fillMaxSize()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
        ) {
            TopBar(
                content = {
                    Text(text = "withUs", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            )
            UserInfoBox()
            MainMenuBox()
        }
    }
}
