package com.masaischool.emp.dto;


public class EmployeeDto {
	private String empis;
	private String name;
	private double ctc;
	private String state;
	private EmployeeDto manager;
	public String getEmpis() {
		return empis;
	}
	public void setEmpis(String empis) {
		this.empis = empis;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCtc() {
		return ctc;
	}
	public void setCtc(double ctc) {
		this.ctc = ctc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public EmployeeDto getManager() {
		return manager;
	}
	public void setManager(EmployeeDto manager) {
		this.manager = manager;
	}
	
	
}
