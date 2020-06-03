package com.lilas.weathertestaplication.service;


import com.lilas.weathertestaplication.models.WeatherDTO;

import java.util.List;

public interface StorageService {

    void insertDatabase(List<WeatherDTO> weatherDTOList);

    List<WeatherDTO> getAllWeather();

    void clearAll();
}
