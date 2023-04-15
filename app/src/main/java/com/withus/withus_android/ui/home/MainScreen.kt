package com.withus.withus_android.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun MainScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray.copy(alpha = 0.5f)
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
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