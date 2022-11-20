package com.day1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private int id;


    @Column(name = "studentName")
    private String name;


    public Student(){

    }
    public Student(int roll,String name){
        super();
        this.id = roll;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.day1.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
