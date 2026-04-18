package com.example.weathermentor.repo.remote

data class WeatherCurrent(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)