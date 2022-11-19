package com.c4.usecase;

import java.util.Scanner;

import com.c4.dao.EmployeeDao;
import com.c4.dao.EmployeeDaoImpl;
import com.c4.model.Employee;

import ExceptionPack.EmployeeException;

public class Login {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter email :");
		String email= sc.next();

		System.out.println("Enter Password :");
		String password= sc.next();


		EmployeeDao dao = new EmployeeDaoImpl();

		Employee employee;
		try {
			employee = dao.login(email, password);
			System.out.println("Welcome "+employee.getEname());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}








