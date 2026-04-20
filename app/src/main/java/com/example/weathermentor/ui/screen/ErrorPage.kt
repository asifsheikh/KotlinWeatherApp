package com.example.weathermentor.ui.screen

import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ErrorPage(modifier: Modifier = Modifier, message: String) {
    Text(text = message, modifier = modifier.safeContentPadding())
}