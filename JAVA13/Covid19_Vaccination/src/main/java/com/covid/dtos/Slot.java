package com.covid.dtos;

public enum Slot {
    SLOT1("morning"), SLOT2("afternoon"), SLOT3("evening"),
    SLOT4("morning"), SLOT5("afternoon"), SLOT6("evening"),
    SLOT7("morning"), SLOT8("afternoon");
    
    private String timeSlot;
    
    Slot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    
    Slot() {
        this.timeSlot = "unknown";
    }
    
    public String getTimeSlot() {
        return this.timeSlot;
    }
}
