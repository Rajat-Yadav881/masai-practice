package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
	private String email;
	@Pattern(regexp = "^[a-zA-Z]*$",message = "First Name  characters")
	private String firstName;
	
	@Pattern(regexp = "^[a-zA-Z]*$",message = "last Name ")
	private String lastName;
	@Column(unique = true)
	@Size(min = 10,max = 10,message = "number 10 digits")
	private String mobilenumber;
	private LocalDate dateOfBirth;
	
}
