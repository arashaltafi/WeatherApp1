package com.arash.altafi.weatherapp1.presentation

import com.arash.altafi.weatherapp1.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
