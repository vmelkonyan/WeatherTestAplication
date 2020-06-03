package com.lilas.openweathertestapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.lilas.weathertestaplication.R
import com.lilas.weathertestaplication.databinding.WeatherHourlyItemBinding
import com.lilas.weathertestaplication.models.WeatherDTO

import java.util.*

class WeatherHourlyAdapter : RecyclerView.Adapter<WeatherHourlyAdapter.WeatherViewHolder>() {

    private var mViewHourlyWeather: List<WeatherDTO> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val weatherHourlyItemBindingtem: WeatherHourlyItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.weather_hourly_item, parent, false)
        return WeatherViewHolder(weatherHourlyItemBindingtem)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val weatherDTO = mViewHourlyWeather[position]
        holder.weatherHourlyItemBinding.weather = weatherDTO
    }

    override fun getItemCount(): Int {
        return mViewHourlyWeather.size
    }

    inner class WeatherViewHolder(val weatherHourlyItemBinding: WeatherHourlyItemBinding) : ViewHolder(weatherHourlyItemBinding.root)

    fun setViewHourlyWeather(mViewHourlyWeather: List<WeatherDTO>) {
        this.mViewHourlyWeather = mViewHourlyWeather
        notifyDataSetChanged()
    }

}