package com.lilas.weathertestaplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.lilas.openweathertestapp.callback.WeatherLoadCallBack
import com.lilas.weathertestaplication.repo.WeatherRepo

class MainViewModel(application: Application,
                    private val weatherRepo: WeatherRepo) : AndroidViewModel(application) {

    fun getWeatherList(appKey: String?, weatherLoadCallBack: WeatherLoadCallBack?) {
        if (weatherLoadCallBack != null) {
            weatherRepo.getWeatherList(appKey, weatherLoadCallBack)
        }
    }

}