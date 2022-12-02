package com.masai1;

import java.util.Map;

public class A {

    private Map<Student,String> map;

    public Map<Student, String> getMap() {
        return map;
    }

    public void setMap(Map<Student, String> map) {
        this.map = map;
    }

    public void show() {
        System.out.println("inside showA of A ");
        System.out.println(map);
    }
}
