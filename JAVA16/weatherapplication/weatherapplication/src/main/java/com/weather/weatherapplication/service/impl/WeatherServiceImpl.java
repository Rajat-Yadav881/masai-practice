package com.weather.weatherapplication.service.impl;

import com.weather.weatherapplication.entity.LatLong;
import com.weather.weatherapplication.entity.WeatherInfo;
import com.weather.weatherapplication.payload.WeatherInfoCache;
import com.weather.weatherapplication.repository.WeatherInfoRepository;
import com.weather.weatherapplication.repository.WeatherRepository;
import com.weather.weatherapplication.service.WeatherService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.ZoneOffset;

import org.json.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeatherInfoRepository weatherInfoRepository;

    @Autowired
    private WeatherInfoCache weatherInfoCache;

    private static final String API_KEY = "8d7004ad8ced57e9c56ada80bbddfd99";
    @Override
    public LatLong getLatLongFromPincode(String pincode) throws IOException, JSONException {

            String urlString = "https://api.openweathermap.org/data/2.5/weather?id=" + pincode + ",&appid=" + API_KEY;

            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String response = in.readLine();

                JSONObject jsonResponse = new JSONObject(response);
                JSONArray results = jsonResponse.getJSONArray("results");
                JSONObject result = results.getJSONObject(0);
                JSONObject geometry = result.getJSONObject("geometry");
                JSONObject location = geometry.getJSONObject("location");
                double latitude = location.getDouble("lat");
                double longitude = location.getDouble("lng");

               LatLong newLatLong = new LatLong(latitude, longitude);

               weatherRepository.save(newLatLong);
               return newLatLong;
            } else {
                throw new IOException("Failed to get lat/long for pincode: " + pincode);
            }

    }

    @Override
    public WeatherInfo getWeatherInfoFromCache(String pincode, LocalDate date) {
        // Check if the weather information is already in the cache
        WeatherInfo weatherInfo = weatherInfoCache.get(pincode + date.toString());
        if (weatherInfo != null) {
            return weatherInfo;
        }

        // If not in cache, retrieve it from the database
        weatherInfo = weatherInfoRepository.findByPincodeAndDate(pincode, date);
        if (weatherInfo != null) {
            // Add the retrieved weather information to the cache
            weatherInfoCache.put(pincode + date.toString(), weatherInfo);
        }

        return weatherInfo;
    }

    public void saveWeatherInfo(WeatherInfo weatherInfo) {
        weatherInfoRepository.save(weatherInfo);
    }
    public WeatherInfo getWeatherInfoFromApi(LatLong latLong, LocalDate for_date) throws InterruptedException, IOException {
        // Get the API key from a configuration file or environment variable


        // Construct the URL for the OpenWeatherMap API call
        String apiUrl = "https://api.openweathermap.org/data/2.5/onecall";
        String query = String.format("lat=%s&lon=%s&units=metric&exclude=minutely,hourly,daily&appid=%s", latLong.getLatitude(), latLong.getLongitude(), API_KEY);
        String url = apiUrl + "?" + query;

        // Send the HTTP request and parse the response
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject json = new JSONObject(response.body());

        // Extract the weather information for the specified date
        long unixTime = for_date.atStartOfDay(ZoneOffset.UTC).toEpochSecond();
        JSONArray hourly = json.getJSONArray("hourly");
        JSONObject hourlyData = null;
        for (int i = 0; i < hourly.length(); i++) {
            JSONObject data = hourly.getJSONObject(i);
            long dt = data.getLong("dt");
            if (dt == unixTime) {
                hourlyData = data;
                break;
            }
        }

        // Parse the weather information and return a WeatherInfo object
        if (hourlyData != null) {

            WeatherInfo weatherInfo = new WeatherInfo();

            return weatherInfo;
        } else {
            return null;
        }
    }

}
