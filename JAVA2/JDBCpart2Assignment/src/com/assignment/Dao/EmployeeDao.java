package com.assignment.Dao;


import com.assignment.model.Employee;

public interface EmployeeDao {
	public String registerEmployee(Employee employee);
	public Employee getByEmployee(String dname);
	
}
