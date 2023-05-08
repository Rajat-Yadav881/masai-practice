package com.weather.weatherapplication.repository;

import java.time.LocalDate;

import com.weather.weatherapplication.entity.WeatherInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherInfoRepository extends JpaRepository<WeatherInfo, Long> {
    WeatherInfo findByPincodeAndDate(String pincode, LocalDate date);
}

