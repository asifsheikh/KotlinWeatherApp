package com.example.weathermentor.repo

import com.example.weathermentor.repo.remote.Weather

interface DataSource {
    suspend fun getWeatherData(query: String): Weather
}