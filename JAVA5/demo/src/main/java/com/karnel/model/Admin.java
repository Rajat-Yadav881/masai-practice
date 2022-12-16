package com.karnel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AdminId;
	
	private String firstName;

	private String lastName;

	private String mobileNumber;

	private String password;
	
	private String email;

}
