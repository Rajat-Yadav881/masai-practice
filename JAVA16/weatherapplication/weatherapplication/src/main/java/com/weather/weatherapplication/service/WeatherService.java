package com.weather.weatherapplication.service;

import com.weather.weatherapplication.entity.LatLong;
import com.weather.weatherapplication.entity.WeatherInfo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.LocalDate;

public interface WeatherService {

    LatLong getLatLongFromPincode(String pincode) throws IOException;

    WeatherInfo getWeatherInfoFromCache(String pincode, LocalDate date);

    void saveWeatherInfo(WeatherInfo weatherInfo);

    WeatherInfo getWeatherInfoFromApi(LatLong latLong, LocalDate for_date) throws InterruptedException, IOException;
}