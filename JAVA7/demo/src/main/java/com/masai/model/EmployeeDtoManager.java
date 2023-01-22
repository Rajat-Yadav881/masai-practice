package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDtoManager {
	
private Integer empid;
	
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	private Integer phoneNumber;
	private double salary;
	private Employee manager;
	
	
}
