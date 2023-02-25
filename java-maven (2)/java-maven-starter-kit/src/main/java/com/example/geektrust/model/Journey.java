package com.example.geektrust.model;

public class Journey {
	Station origin;
    Station destination;
    int fare;

    public Journey(Station origin, Station destination, int fare) {
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
    }

    public Station getOrigin() {
        return origin;
    }

    public Station getDestination() {
        return destination;
    }

    public int getFare() {
        return fare;
    }
}
