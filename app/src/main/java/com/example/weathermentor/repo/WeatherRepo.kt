package com.example.weathermentor.repo

import com.example.weathermentor.domain.WeatherDomain

interface WeatherRepo {
    suspend fun getWeather(city: String): WeatherDomain
}