package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	@NotNull
	private String customerName;
	@Size(min = 3,max =15 )
	private String address;
	@Min(18)
	private Integer age;
	@Email
	private String email;

	private String phone;
	@Size(min = 8,max = 15)
	private String password;
	public Customer(@NotNull String customerName, @Size(min = 3, max = 15) String address, @Min(18) Integer age,
			@Email String email, String phone, @Size(min = 8, max = 15) String password) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	
	
}
