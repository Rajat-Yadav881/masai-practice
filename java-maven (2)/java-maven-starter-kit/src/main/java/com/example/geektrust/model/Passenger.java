package com.example.geektrust.model;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
	MetroCard metroCard;
    String passengerType;
    List<Journey> travelHistory;

    public Passenger(MetroCard metroCard, String passengerType) {
        this.metroCard = metroCard;
        this.passengerType = passengerType;
        this.travelHistory = new ArrayList<>();
    }

    public MetroCard getMetroCard() {
        return metroCard;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public List<Journey> getTravelHistory() {
        return travelHistory;
    }

    public void addTravelHistory(Journey journey) {
        travelHistory.add(journey);
    }
}
