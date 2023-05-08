package com.weather.weatherapplication.repository;

import com.weather.weatherapplication.entity.LatLong;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<LatLong,Double> {
}
