package com.lilas.openweathertestapp.di


import com.lilas.openweathertestapp.dao.SQLiteDatabaseHandler
import com.lilas.weathertestaplication.MainViewModel
import com.lilas.weathertestaplication.repo.WeatherRepo
import com.lilas.weathertestaplication.service.RetrofitClientInstance
import com.lilas.weathertestaplication.service.StorageServiceImpl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModel = module {
    viewModel { MainViewModel(get(), get()) }
}

val storageModule = module {
    factory { SQLiteDatabaseHandler(get()) }
}

val repoModule = module {
    single { StorageServiceImpl(get()) }
    single { WeatherRepo(get()) }
}

val apiModule = module {
    single {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
    }
    single { RetrofitClientInstance.getClient(client = get()) }
}
