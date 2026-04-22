package com.example.weathermentor.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.weathermentor.domain.WeatherDomain

@Composable
fun WeatherPage(modifier: Modifier = Modifier, weather: WeatherDomain, onNewCityClick: (String) -> Unit) {
    var city by remember { mutableStateOf("") }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row {
            TextField(
                value = city,
                onValueChange = { city = it },
                label = { Text("City") }
            )
            Button(onClick = {
                onNewCityClick(city)
            }) {
                Text("Search")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("City = ${weather.city}", modifier = Modifier.padding(16.dp))
        Text("Weather: ${weather.temp}", modifier = Modifier.padding(16.dp))
    }
}