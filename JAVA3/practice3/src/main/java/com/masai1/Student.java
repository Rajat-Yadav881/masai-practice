package com.masai1;

import java.util.Objects;

public class Student {

    private int roll;
    private String name;
    private int marks;

    public Student() {
    }

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return roll == student.roll && marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, marks);
    }

    public void displayDetails() {
        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);
    }
}
