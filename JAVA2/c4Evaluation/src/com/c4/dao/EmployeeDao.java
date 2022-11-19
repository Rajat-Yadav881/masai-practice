package com.c4.dao;

import com.c4.model.Employee;

import ExceptionPack.EmployeeException;

public interface EmployeeDao {
	public String setEmployee(Employee employee) throws EmployeeException;
	
	public Employee checkEmpDept(String dname) throws EmployeeException;
	
	public Employee login(String email,String password) throws EmployeeException;
}
