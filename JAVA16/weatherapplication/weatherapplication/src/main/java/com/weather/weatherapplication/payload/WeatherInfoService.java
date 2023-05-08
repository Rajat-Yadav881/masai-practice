package com.weather.weatherapplication.payload;

import com.weather.weatherapplication.entity.WeatherInfo;
import com.weather.weatherapplication.repository.WeatherInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherInfoService {
    @Autowired
    private WeatherInfoRepository weatherInfoRepository;

    public void saveWeatherInfo(WeatherInfo weatherInfo) {
        weatherInfoRepository.save(weatherInfo);
    }
}
