package com.c4.usecase;

import java.util.Scanner;

import com.c4.dao.DepartmentDao;
import com.c4.dao.DepartmentDaoImpl;
import com.c4.model.Department;

import ExceptionPack.DepartmentException;

public class registerDepartment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department name: ");
		String dname = sc.next();
		System.out.println("Enter the location: ");
		String location  = sc.next();
		
		
		Department dp = new Department();
		dp.setDname(dname);
		dp.setLocation(location);
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
		try {
		String x = dao.setDepartment(dp);
		System.out.println(x);
		}catch(DepartmentException e){
			e.printStackTrace();
			
		}
		
		
	}
}
