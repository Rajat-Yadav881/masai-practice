package com.masai;

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

    public void displayDetails() {
        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+marks);
    }

}
