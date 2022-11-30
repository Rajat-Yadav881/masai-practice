package com.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instructorId;
    private String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    public Instructor() {
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
