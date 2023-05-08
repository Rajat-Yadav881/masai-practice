package com.pincode.pincodeDistanceFinder.service;

import com.pincode.pincodeDistanceFinder.model.LocationDetail;

public interface LocationService {
    LocationDetail getTheDistance(String cityName);
}
