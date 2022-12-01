package com.model;

public class PartTimeInstructor extends Instructor{
    private int noOfSession;
    private double costPerSession;
    private String mobileNumber;

    public PartTimeInstructor() {
        super();
    }

    public PartTimeInstructor(String instructorName, int noOfSession, double costPerSession, String mobileNumber) {
        super(instructorName);
        this.noOfSession = noOfSession;
        this.costPerSession = costPerSession;
        this.mobileNumber = mobileNumber;
    }





    public int getNoOfSession() {
        return noOfSession;
    }

    public void setNoOfSession(int noOfSession) {
        this.noOfSession = noOfSession;
    }

    public double getCostPerSession() {
        return costPerSession;
    }

    public void setCostPerSession(double costPerSession) {
        this.costPerSession = costPerSession;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
