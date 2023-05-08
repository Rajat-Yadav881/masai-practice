package com.masaischool.emp.service;

import java.util.List;

import com.masaischool.emp.dto.EmployeeDto;
import com.masaischool.emp.entity.Employee;
import com.masaischool.emp.exception.NoEmployeeException;
import com.masaischool.emp.exception.NoManagerException;

public interface EmployeeService {
	/**
	 * used to add the em[ployee to database without manager information
	 * @param employeeDto object o fthe DTO contains the details of the employee
	 * @return
	 */
	public EmployeeDto addEmployee(EmployeeDto dto);
	
	/**
	 * 
	 * @param empId
	 * @param managerId
	 * 
	 */
	public void assignEmployeeToManager(String empId,String managerId)throws NoEmployeeException;
	/**
	 * 
	 * @param empId
	 * @return
	 * @throws NoManagerException
	 */
	public String getFirstLevelManager(String empId)throws NoManagerException,NoEmployeeException;
	/**
	 * 
	 * @param empId
	 * @return
	 * @throws NoManagerException
	 * @throws NoEmployeeException
	 */
	public String getSecondLevelManager(String empId)throws NoManagerException,NoEmployeeException;
	
	public List<String> getFirstLevelReportees(String managerId)throws NoEmployeeException,NoManagerException;
	public List<String>  getSecondLevelReportees(String managerId)throws NoEmployeeException,NoManagerException;
}
