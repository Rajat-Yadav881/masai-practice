package com.assignment.usecase;

import java.util.Scanner;

import com.assignment.Dao.EmployeeDao;
import com.assignment.Dao.EmployeeDaoImpl;
import com.assignment.model.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid: ");
		int empid = sc.nextInt();
		System.out.println("Enter ename: ");
		String ename = sc.next();
		System.out.println("Enter address: ");
		String address = sc.next();
		System.out.println("Enter mobile: ");
		String mobile = sc.next();
		System.out.println("Enter deptid: ");
		int deptid = sc.nextInt();
		Employee employee = new Employee();
		employee.setEmpid(empid);		
		employee.setEname(ename);
		employee.setAddress(address);
		employee.setMobile(mobile);
		employee.setDeptid(deptid);
		EmployeeDao dao = new EmployeeDaoImpl();
		String result = dao.registerEmployee(employee);
		System.out.println(result);
	}
}
