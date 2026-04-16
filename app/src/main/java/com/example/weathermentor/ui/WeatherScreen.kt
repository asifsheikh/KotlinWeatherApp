package com.example.weathermentor.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.weathermentor.ui.screen.ErrorPage
import com.example.weathermentor.ui.screen.LoadingPage
import com.example.weathermentor.ui.screen.WeatherPage
import com.example.weathermentor.viewmodel.WeatherViewModel

@Composable
fun WeatherScreen(
    modifier: Modifier = Modifier,
    weatherViewModel: WeatherViewModel = hiltViewModel()
) {
    val uiState by weatherViewModel.uiState.collectAsStateWithLifecycle()

    when (val state = uiState) {
        is WeatherUiState.Success -> WeatherPage(weather = state.value, modifier = modifier)
        is WeatherUiState.Error -> ErrorPage(message = state.message, modifier = modifier)
        is WeatherUiState.Loading -> LoadingPage()
    }
}