package com.withus.withus_android.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.withus.withus_android.ui.components.MenuCardBox

@Preview
@Composable
fun MainMenuBox() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "스터디 공간",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 10.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            userScrollEnabled = false,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            item {
                MenuCardBox(title = "공식방 선택하기", content = "공식방 랜덤 입장하기")
            }
            item {
                MenuCardBox(title = "공식방 입장하기", content = "원하는 컨셉 선택하기")
            }
            item {
                MenuCardBox(title = "내 스터디룸", content = "내 스터디룸 관리하기")
            }
            item {
                MenuCardBox(title = "방 만들기", content = "나만의 스터디룸 만들기")
            }
        }
    }
}