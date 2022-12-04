package com.spring.entities;

import org.springframework.stereotype.Service;

import java.util.Objects;

public class Employee {

    private int empId;
    private String empName;
    private String address;
    private int salary;

    public Employee() {
    }

    public Employee(int empId, String empName, String address, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && salary == employee.salary && Objects.equals(empName, employee.empName) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, address, salary);
    }
}
