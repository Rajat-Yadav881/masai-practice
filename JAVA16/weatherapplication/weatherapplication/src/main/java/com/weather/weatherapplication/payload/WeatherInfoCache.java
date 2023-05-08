package com.weather.weatherapplication.payload;

import com.weather.weatherapplication.entity.WeatherInfo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WeatherInfoCache {
    private Map<String, WeatherInfo> cache;

    public WeatherInfoCache() {
        this.cache = new HashMap<>();
    }

    public void put(String key, WeatherInfo value) {
        cache.put(key, value);
    }

    public WeatherInfo get(String key) {
        return cache.get(key);
    }

    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }

    public void expireCache(long duration, TimeUnit timeUnit) throws InterruptedException {
        timeUnit.sleep(duration);
        cache.clear();
    }
}
