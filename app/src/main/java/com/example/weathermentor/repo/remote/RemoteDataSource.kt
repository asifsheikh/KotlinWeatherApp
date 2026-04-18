package com.example.weathermentor.repo.remote

import com.example.weathermentor.network.ApiService
import com.example.weathermentor.repo.DataSource
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) : DataSource {
    override suspend fun getWeatherData(query: String): Weather {
        return apiService.getWeather(city = query)
    }
}