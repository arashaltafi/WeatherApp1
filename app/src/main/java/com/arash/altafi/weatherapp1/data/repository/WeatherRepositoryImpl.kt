package com.arash.altafi.weatherapp1.data.repository

import com.arash.altafi.weatherapp1.data.mappers.toWeatherInfo
import com.arash.altafi.weatherapp1.data.remote.WeatherApi
import com.arash.altafi.weatherapp1.domain.repository.WeatherRepository
import com.arash.altafi.weatherapp1.domain.util.Resource
import com.arash.altafi.weatherapp1.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}