package com.mock.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	
	
	private int person_id;
	private String name;
	private String email;
	private int age;
	private String mobile;
	
	
}
