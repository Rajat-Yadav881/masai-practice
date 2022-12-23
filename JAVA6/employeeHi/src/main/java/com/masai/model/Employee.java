package com.masai.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String number;
	private Double salary;
	private EmployeeManagerDTO emd;
	
}
