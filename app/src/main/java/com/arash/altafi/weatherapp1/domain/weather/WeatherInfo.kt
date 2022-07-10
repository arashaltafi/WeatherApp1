package com.arash.altafi.weatherapp1.domain.weather

import com.arash.altafi.weatherapp1.domain.weather.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
