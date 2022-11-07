package com.assignment.usecase;

import java.util.Scanner;

import com.assignment.Dao.EmployeeDao;
import com.assignment.Dao.EmployeeDaoImpl;
import com.assignment.model.Employee;

public class ShowCnameData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the department name: ");
		String dname = sc.next();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee employee = dao.getByEmployee(dname);
		System.out.println(employee);
		
		
	}
}
 