package com.usecase;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.model.Employee;

import java.util.Scanner;

public class RegisterEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String address = sc.next();
        int salary = sc.nextInt();

        Employee employee = new Employee(name,address,salary);

        EmployeeDao dao = new EmployeeDaoImpl();
        try {
            dao.registerEmployee(employee);
        } catch (EmployeeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
