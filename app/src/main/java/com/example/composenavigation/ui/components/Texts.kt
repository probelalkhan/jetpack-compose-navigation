package com.example.composenavigation.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(title: String) {
    Text(
        text = title,
        fontSize = 28.sp,
        color = Color.Black,
        modifier = Modifier.padding(top = 18.dp, bottom = 12.dp)
    )
}

@Composable
fun NormalText(text: String) {
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp).wrapContentSize()
    )
}