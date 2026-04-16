package com.example.weathermentor.presentation

import com.example.weathermentor.data.Weather
import com.example.weathermentor.repo.WeatherRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(
    private val weatherRepo: WeatherRepo
) {
    operator fun invoke(city: String): Flow<Weather> = flow {
        emit(weatherRepo.getWeather(city))
    }
}