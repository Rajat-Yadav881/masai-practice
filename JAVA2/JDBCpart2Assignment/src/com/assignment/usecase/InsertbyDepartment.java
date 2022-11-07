package com.assignment.usecase;

import java.util.Scanner;

import com.assignment.Dao.DepartmentDao;
import com.assignment.Dao.DepartmentDaoImpl;
import com.assignment.model.Department;

public class InsertbyDepartment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter did: ");
		int did = sc.nextInt();
		System.out.println("Enter dname: ");
		String dname = sc.next();
		System.out.println("Enter location: ");
		String location = sc.next();
		
		Department department = new Department();
		department.setDid(did);
		department.setDname(dname);
		department.setLocation(location);
		
		DepartmentDao dao = new DepartmentDaoImpl();
		String result = dao.setByDepartment(department);
		System.out.println(result);
	}
}
