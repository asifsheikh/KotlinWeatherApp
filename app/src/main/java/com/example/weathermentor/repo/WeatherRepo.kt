package com.example.weathermentor.repo

import com.example.weathermentor.data.Weather
import kotlinx.coroutines.flow.Flow

interface WeatherRepo {
    suspend fun getWeather(city: String): Flow<Weather>
}