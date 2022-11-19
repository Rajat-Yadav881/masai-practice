package com.c4.usecase;

import java.util.Scanner;

import com.c4.dao.EmployeeDao;
import com.c4.dao.EmployeeDaoImpl;
import com.c4.model.Employee;

import ExceptionPack.EmployeeException;

public class RegisterEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ename: ");
		String ename  = sc.next();
		System.out.println("Enter address: ");
		String address  = sc.next();
		System.out.println("Enter email: ");
		String email  = sc.next();
		System.out.println("Enter password: ");
		String password  = sc.next();
		System.out.println("Enter salary: ");
		int salary  = sc.nextInt();
		
		
		Employee employee = new Employee();
		employee.setEname(ename);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setSalary(salary);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		try {
			String x = dao.setEmployee(employee);
			System.out.println(x);
		}catch(EmployeeException e) {
			e.getMessage();
		}
		
		
	}
}
