package com.massai.jpql;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@NamedQuery(query = "select e from Employee e where e.eid = :id",name = "findEmployee")
@NamedNativeQuery(query = "select * from employee e where e.ename = ?",resultClass = Employee.class,name = "getPersonByName")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;
    private String ename;
    private double salary;
    private String deg;

    public Employee(String ename, double salary, String deg) {
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee(int eid, String ename, double salary, String deg) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }

    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deg='" + deg + '\'' +
                '}';
    }

    public String getDeg() {
        return deg;
    }

    public void setDeg(String deg) {
        this.deg = deg;
    }
}
