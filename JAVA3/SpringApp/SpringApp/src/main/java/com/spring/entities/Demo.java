package com.spring.entities;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class Demo {

    //use setter injection to inject theMap;
    private Map<Department, Employee> theMap;

    public void setTheMap(Map<Department, Employee> theMap) {
        this.theMap = theMap;
    }

    public void myInit(){
        System.out.println("inside myInit method");
    }

    public void cleanUp() {
        System.out.println("inside cleanUp method");
    }

    public void showDetails(){
        System.out.println("inside showDetails of Demo class");
        System.out.println(theMap);
        //print all the details of all the employees department-wise.
    }
}
