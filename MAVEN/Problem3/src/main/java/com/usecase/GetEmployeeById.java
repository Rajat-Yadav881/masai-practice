package com.usecase;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.exception.EmployeeException;
import com.model.Employee;

import java.util.Scanner;

public class GetEmployeeById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int id = sc.nextInt();
        Employee employee;
        EmployeeDao dao = new EmployeeDaoImpl();
        try {
           employee = dao.getEmployeeById(id);
            System.out.println(employee);
        } catch (EmployeeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
