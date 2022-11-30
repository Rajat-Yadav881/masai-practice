package com.model;

public class FullTimeInstructor extends Instructor{
    private double salary;
    private String email;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FullTimeInstructor(String instructorName, double salary, String email) {
        super(instructorName);
        this.salary = salary;
        this.email = email;
    }

    @Override
    public String toString() {
        return "FullTimeInstructor{" +
                "salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }
}
