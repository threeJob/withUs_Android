package com.withus.withus_android.ui.start.state

data class LogInState(
    val isLoggedIn: Boolean = true,
    val accessToken: String = "",
    val refreshToken: String = "",
)
