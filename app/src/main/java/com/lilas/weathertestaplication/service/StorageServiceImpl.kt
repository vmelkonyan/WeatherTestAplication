package com.lilas.weathertestaplication.service

import com.lilas.openweathertestapp.dao.SQLiteDatabaseHandler
import com.lilas.weathertestaplication.models.WeatherDTO

class StorageServiceImpl(private val db: SQLiteDatabaseHandler) : StorageService {

    override fun insertDatabase(weatherDTOList: List<WeatherDTO>) {
        for (weatherDTO in weatherDTOList) {
            db.addWeatherDTO(weatherDTO)
        }
    }

    override fun getAllWeather(): List<WeatherDTO> {
        return db.allWeather
    }

    override fun clearAll() {
        db.cleareDb()
    }

}