package com.example.weathermentor.network

import com.example.weathermentor.data.Weather
import retrofit2.http.Query

interface ApiService {
    suspend fun getWeather(
        @Query("appid") appid: String,
        @Query("q") city: String
    ): Weather
}