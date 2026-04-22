package com.example.weathermentor.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weathermentor.domain.GetWeatherUseCase
import com.example.weathermentor.ui.WeatherUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherUseCase: GetWeatherUseCase
) : ViewModel() {

    private val _city = MutableStateFlow("Seattle")

    @OptIn(ExperimentalCoroutinesApi::class)
    val uiState: StateFlow<WeatherUiState> = _city.flatMapLatest { city ->
        weatherUseCase.invoke(city = city)
    }.map {
            WeatherUiState.Success(value = it)
        }.catch {
            WeatherUiState.Error(message = it.message.toString())
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = WeatherUiState.Loading
        )

    fun updateCity(newCity: String) {
        _city.value = newCity
    }
}