package com.example.geektrust.model;

import java.util.HashMap;
import java.util.Map;

public class Summary {
	Map<String, Integer> passengerCounts;
    Map<String, Integer> stationCharges;
    public Summary() {
        passengerCounts = new HashMap<>();
        stationCharges = new HashMap<>();
    }
    
    public void addPassenger(String stationName) {
        int currentCount = passengerCounts.getOrDefault(stationName, 0);
        passengerCounts.put(stationName, currentCount + 1);
    }
    
    public void addCharge(String stationName, Integer charge) {
        Integer currentCharge = stationCharges.getOrDefault(stationName, 0);
        stationCharges.put(stationName, currentCharge + charge);
    }
    
    public void printSummary() {
        System.out.println("Summary of travel charges and passenger counts per station:");
        for (String stationName : passengerCounts.keySet()) {
            int passengerCount = passengerCounts.get(stationName);
            Integer stationCharge = stationCharges.getOrDefault(stationName, 0);
            System.out.println(stationName + ": " + passengerCount + " passengers, " + stationCharge + " charged");
        }
    }    
    
}
