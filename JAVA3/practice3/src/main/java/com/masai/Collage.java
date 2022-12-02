package com.masai;

import java.util.List;

public class Collage {
    private String collageName;
    private List<Student> students;

    public Collage() {
    }

    public Collage(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
