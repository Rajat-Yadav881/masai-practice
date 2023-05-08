package com.pincode.pincodeDistanceFinder.service.serviceImpl;

import com.pincode.pincodeDistanceFinder.model.LocationDetail;
import com.pincode.pincodeDistanceFinder.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public LocationDetail getTheDistance(String cityName) {
//        String API_KEY = "AIzaSyDXMMcLACqNGpmb8uQSQinDlTyIgLkxMlA";
        String url = "http://api.openweathermap.org/geo/1.0/direct?q={city}&limit=1&appid=AIzaSyDXMMcLACqNGpmb8uQSQinDlTyIgLkxMlA";

        url = url.replace("{city}",cityName);
        ResponseEntity<LocationDetail[]> locationResponseEntity = restTemplate.getForEntity(url,LocationDetail[].class);

        LocationDetail[] locationDetails = locationResponseEntity.getBody();
        for(LocationDetail ld:locationDetails){
            System.out.println(ld.getLat()+"****"+ld.getLon());
        }
        return locationDetails[0];
    }
}
