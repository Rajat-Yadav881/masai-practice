package com.weather.weatherapplication.controller;

import com.weather.weatherapplication.entity.LatLong;
import com.weather.weatherapplication.entity.WeatherInfo;
import com.weather.weatherapplication.payload.WeatherInfoService;
import com.weather.weatherapplication.repository.WeatherRepository;
import com.weather.weatherapplication.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDate;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;


    @GetMapping("/weather/{pincode}/{for_date}")
    public WeatherInfo getWeatherInfo(@PathVariable String pincode, @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate for_date) throws IOException, InterruptedException {
        // Validate input parameters
        // ...

        // Check if weather information is cached
        WeatherInfo cachedWeatherInfo = weatherService.getWeatherInfoFromCache(pincode, for_date);
        if (cachedWeatherInfo != null) {
            return cachedWeatherInfo;
        }

        // Get latitude and longitude for the given pincode using a geocoding API
        LatLong latLong = weatherService.getLatLongFromPincode(pincode);

        // Get weather information for the given latitude and longitude and date using the OpenWeather API
        WeatherInfo weatherInfo = weatherService.getWeatherInfoFromApi(latLong, for_date);

        // Save the weather information and lat-long in the database
        weatherService.saveWeatherInfo(weatherInfo);

        return weatherInfo;
    }
}

