package com.email.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "USER")

public class User {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")

	private Integer id;
	
	private String name;
	
	private String phoneNo;
	
	private String DateOfBirth;
	
	@OneToOne
	@PrimaryKeyJoinColumn
     Email email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", DateOfBirth=" + DateOfBirth
				+ ", email=" + email + "]";
	}
	
public User() {
	// TODO Auto-generated constructor stub
}

public User(int id, String name, String phoneNo, String dateOfBirth, Email email) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNo = phoneNo;
	DateOfBirth = dateOfBirth;
	this.email = email;
}


     
	

}
