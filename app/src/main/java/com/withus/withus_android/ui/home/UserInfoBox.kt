package com.withus.withus_android.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.withus.withus_android.ui.components.CardBox

@Composable
fun UserInfoBox() {
    val userName = "행복이 친구"
    val studiedTime = 45
    val studyGoalTime = 60
    val weekLargestStudiedTime = 500
    Column(modifier = Modifier.fillMaxWidth()) {
//        Text(text = "테더 정", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(10.dp))
        CardBox() {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(text = userName, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "오늘 공부시간", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                    Text(text = "목표 설정하기 >", fontSize = 10.sp)
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "${studiedTime}분", fontSize = 15.sp)
                    Text(text = "/")
                    Text(text = "${studyGoalTime}분", fontSize = 15.sp)
                }
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Gray,
                    backgroundColor = Color.LightGray,
                    progress = studiedTime / studyGoalTime.toFloat(),
                    strokeCap = StrokeCap.Round,
                )
                Text(text = "이번주 최고기록 : ${weekLargestStudiedTime}", fontSize = 11.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}