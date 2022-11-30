package com.model;

import javax.persistence.Enumerated;

public class PhoneNumber {
    private int phoneId;
    private String phoneNumber;
    @Enumerated
    private phoneType phoneType;

    public PhoneNumber() {
    }

    public PhoneNumber(int phoneId, String phoneNumber, com.model.phoneType phoneType) {
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public com.model.phoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(com.model.phoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneId=" + phoneId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneType=" + phoneType +
                '}';
    }
}
