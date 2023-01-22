package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	private Integer empid;
	
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	private Integer phoneNumber;
	private double salary;
	private List<Employee> employees = new ArrayList<>();
	
}
