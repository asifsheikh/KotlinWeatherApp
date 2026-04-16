package com.example.weathermentor.repo

import com.example.weathermentor.data.Weather
import com.example.weathermentor.network.ApiService
import javax.inject.Inject

class WeatherRepoImpl @Inject constructor(
    private val apiService: ApiService
) : WeatherRepo {
    override suspend fun getWeather(city: String): Weather =
        apiService.getWeather(city = city)
}