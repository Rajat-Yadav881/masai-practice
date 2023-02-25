package com.example.geektrust.model;

import java.util.ArrayList;
import java.util.List;

public class Station {
	String name;
    List<Passenger> passengers;

    public Station(String name) {
        this.name = name;
        this.passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
