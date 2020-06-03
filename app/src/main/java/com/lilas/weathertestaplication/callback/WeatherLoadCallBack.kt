package com.lilas.openweathertestapp.callback

import com.lilas.weathertestaplication.models.WeatherDTO

interface WeatherLoadCallBack {
    fun onSuccess(weatherDTOList: List<WeatherDTO>)
    fun onFailure(message: String?)
}