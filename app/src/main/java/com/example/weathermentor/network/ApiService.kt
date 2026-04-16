package com.example.weathermentor.network

import com.example.weathermentor.data.Weather
import com.example.weathermentor.di.ApiModule
import retrofit2.http.Query

interface ApiService {
    suspend fun getWeather(
        @Query("q") city: String,
        @Query("appid") appid: String = ApiModule.appid
    ): Weather
}