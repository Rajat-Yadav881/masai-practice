package com.example.geektrust.model;

import java.util.ArrayList;
import java.util.List;

public class MetroSummary {
	List<Station> stations;
    Journey currentJourney;

    public MetroSummary() {
        this.stations = new ArrayList<>();
    }

    public List<Station> getStations() {
        return stations;
    }

    public Journey getCurrentJourney() {
        return currentJourney;
    }

    public void setCurrentJourney(Journey currentJourney) {
        this.currentJourney = currentJourney;
    }

    public void addStation(Station station) {
        stations.add(station);
    }
}
