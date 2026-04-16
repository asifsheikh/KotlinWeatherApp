package com.example.weathermentor.ui

import com.example.weathermentor.data.WeatherX

sealed interface WeatherUiState {
    data object Loading: WeatherUiState
    data class Success(val value: WeatherX): WeatherUiState
    data class Error(val message: String): WeatherUiState
}