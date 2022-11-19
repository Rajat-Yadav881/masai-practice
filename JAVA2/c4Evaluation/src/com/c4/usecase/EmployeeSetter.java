package com.c4.usecase;

import java.util.Scanner;

import com.c4.dao.EmployeeDao;
import com.c4.dao.EmployeeDaoImpl;
import com.c4.model.Employee;

import ExceptionPack.EmployeeException;

public class EmployeeSetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department name: ");
		String dname  = sc.next();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee employee;
		try {
			employee = dao.checkEmpDept(dname);
			System.out.println(employee);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
