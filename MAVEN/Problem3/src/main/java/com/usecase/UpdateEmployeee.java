package com.usecase;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.model.Employee;

import java.util.Scanner;

public class UpdateEmployeee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter employee name: ");
        String name= scanner.next();

        System.out.println("Please enter employee address: ");
        String address= scanner.next();

        System.out.println("Please enter employee salary: ");
        int salary = scanner.nextInt();

        System.out.println("Please enter employee Id: ");
        int empId= scanner.nextInt();

        EmployeeDao dao= new EmployeeDaoImpl();

        Employee employees= new Employee(empId,name,address,salary);
//        employees.setName(name);
//        employees.setAddress(address);
//        employees.setSalary(salary);
//        employees.setEmpid(empId);

        try {
            dao.updateEmployee(employees);
        } catch (EmployeeException e) {
            throw new RuntimeException(e);
        }
    }
}
