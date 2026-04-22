package com.example.weathermentor.repo

import com.example.weathermentor.domain.WeatherDomain
import javax.inject.Inject

class WeatherRepoImpl @Inject constructor(
    private val remoteDataSource: DataSource
    // private val localDataSource: DataSource
) : WeatherRepo {
    override suspend fun getWeather(city: String): WeatherDomain {
        // cache implementation
        // 1) one day storage, 2) refresh, should live here

        // Pure Kotlin class
        // Should be 100% Unit test coverage.
        val response = remoteDataSource.getWeatherData(query = city)
        return WeatherDomain(city = response.name, temp = response.main.temp.toString())
    }
}