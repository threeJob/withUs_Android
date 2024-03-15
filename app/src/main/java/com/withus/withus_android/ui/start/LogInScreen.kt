package com.withus.withus_android.ui.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.withus.withus_android.R

@Preview
@Composable
fun LogInScreen(startViewModel: StartViewModel = hiltViewModel()) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        val context = LocalContext.current


        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)) {
            Image(
                painterResource(id = R.drawable.kakao_login_medium_wide),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        startViewModel.kakao_login(context)
                    },
            )

        }
    }
}
