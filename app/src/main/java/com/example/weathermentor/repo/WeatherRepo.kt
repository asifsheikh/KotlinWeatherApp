package com.example.weathermentor.repo

import com.example.weathermentor.data.Weather

interface WeatherRepo {
    suspend fun getWeather(city: String): Weather
}