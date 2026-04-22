package com.example.weathermentor.repo.remote

import com.example.weathermentor.data.Main

data class Weather(
    val base: String,
    val cod: Int,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val timezone: Int,
    val visibility: Int,
    val weather: List<WeatherCurrent>,
)