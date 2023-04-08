package com.withus.withus_android.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MenuCardBox(modifier: Modifier = Modifier, title: String, content: String, onClick: () -> Unit = {}) {
    CardBox(modifier = modifier, onClick = onClick) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1.5f), verticalArrangement = Arrangement.SpaceBetween) {
            Text(text = title, fontSize = 17.sp, fontWeight = FontWeight.Bold)
            Text(text = content, fontSize = 13.sp)
        }
    }
}

@Preview
@Composable
fun PreviewMenuCardBox() {
    MenuCardBox(title = "공식방 선택하기", content = "오잉오잉")
}