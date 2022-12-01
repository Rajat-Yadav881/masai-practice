package com.masai.Demo.autowired;

public class Department {
    private String deptName;

    void init(){
        System.out.println("Object was Created by me");
    }
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
