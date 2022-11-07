package com.assignment.usecase;

import java.util.Scanner;

import com.assignment.Dao.DepartmentDao;
import com.assignment.Dao.DepartmentDaoImpl;

public class DeleteDeptElem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department ID: ");
		int did = sc.nextInt();
		
		DepartmentDao dao = new DepartmentDaoImpl();
		dao.deleteDepartment(did);
	}
}
