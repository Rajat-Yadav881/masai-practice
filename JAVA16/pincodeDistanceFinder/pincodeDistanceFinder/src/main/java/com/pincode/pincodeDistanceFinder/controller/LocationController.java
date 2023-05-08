package com.pincode.pincodeDistanceFinder.controller;

import com.pincode.pincodeDistanceFinder.model.LocationDetail;
import com.pincode.pincodeDistanceFinder.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/oceanApi")
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping(value = "/byCity/{city}",method = RequestMethod.GET,consumes = MediaType.ALL_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public LocationDetail getTheAPI(@PathVariable String city){
        LocationDetail locationDetail = locationService.getTheDistance(city);

        return locationDetail;
    }
}
