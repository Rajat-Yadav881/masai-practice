package com.c4.usecase;

import java.util.List;

import com.c4.dao.DepartmentDao;
import com.c4.dao.DepartmentDaoImpl;
import com.c4.model.Department;

import ExceptionPack.DepartmentException;

public class GetDepartment {
	public static void main(String[] args) {
		DepartmentDao cdao= new DepartmentDaoImpl();
		
		try {
		List<Department> dtos= cdao.allDept();
		
		dtos.forEach(dto -> System.out.println(dto));
		
		
		
		}catch(DepartmentException c) {
			System.out.println(c.getMessage());
		}
	}
}
