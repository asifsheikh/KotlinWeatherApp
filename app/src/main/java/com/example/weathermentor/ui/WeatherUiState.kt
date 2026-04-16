package com.example.weathermentor.ui

import com.example.weathermentor.data.Weather

sealed interface WeatherUiState {
    data object Loading: WeatherUiState
    data class Success(val value: Weather): WeatherUiState
    data class Error(val message: String): WeatherUiState
}