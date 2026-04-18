package com.example.weathermentor.domain

import com.example.weathermentor.repo.WeatherRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(
    private val weatherRepo: WeatherRepo
) {
    operator fun invoke(city: String): Flow<WeatherDomain> = flow {
        emit(weatherRepo.getWeather(city))
    }
}