package com.example.weathermentor.ui

import com.example.weathermentor.domain.WeatherDomain

sealed interface WeatherUiState {
    data object Loading: WeatherUiState
    data class Success(val value: WeatherDomain): WeatherUiState
    data class Error(val message: String): WeatherUiState
}