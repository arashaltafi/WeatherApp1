package com.arash.altafi.weatherapp1.data.remote

import com.arash.altafi.weatherapp1.data.remote.WeatherDataDto
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
