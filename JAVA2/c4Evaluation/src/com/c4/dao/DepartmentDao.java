package com.c4.dao;

import java.util.List;

import com.c4.model.Department;

import ExceptionPack.DepartmentException;

public interface DepartmentDao {
	public String setDepartment(Department department) throws DepartmentException;
	public List<Department> allDept()throws DepartmentException;
}
