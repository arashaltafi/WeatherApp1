package com.arash.altafi.weatherapp1.domain.repository

import com.arash.altafi.weatherapp1.domain.util.Resource
import com.arash.altafi.weatherapp1.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}