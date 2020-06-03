package com.lilas.weathertestaplication

import android.app.Application
import com.lilas.openweathertestapp.di.apiModule
import com.lilas.openweathertestapp.di.repoModule
import com.lilas.openweathertestapp.di.storageModule
import com.lilas.openweathertestapp.di.viewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class OpenWeatherApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@OpenWeatherApplication)
            modules(apiModule, repoModule, storageModule, viewModel)
        }
    }
}
