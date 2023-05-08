package com.weather.weatherapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "weather_info")
public class WeatherInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pincode", nullable = false)
    private String pincode;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    public WeatherInfo(String pincode, LocalDate date) {
        this.pincode=pincode;
        this.date=date;
    }
}