package com.withus.withus_android.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CardBox(modifier: Modifier = Modifier, onClick: () -> Unit = {}, content: @Composable () -> Unit) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        backgroundColor = Color.White,
        shape = RoundedCornerShape(20.dp),
        onClick = onClick
    ) {
        Box(modifier = modifier.padding(20.dp)) {
            content()
        }
    }

}