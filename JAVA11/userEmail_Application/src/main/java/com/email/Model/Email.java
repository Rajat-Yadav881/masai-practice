package com.email.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Email")

public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MAIL_ID")

	private Integer mail_id;
	private String email;
	private String created_date;
	
	
	@OneToOne( mappedBy = "email", cascade = CascadeType.ALL)
	@JoinColumn(name="MAIL_ID")
	private User user;


	public Integer getMail_id() {
		return mail_id;
	}


	public void setMail_id(Integer mail_id) {
		this.mail_id = mail_id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCreated_date() {
		return created_date;
	}


	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	public Email() {
		// TODO Auto-generated constructor stub
	}


	public Email(Integer mail_id, String email, String created_date, User user) {
		super();
		this.mail_id = mail_id;
		this.email = email;
		this.created_date = created_date;
		this.user = user;
	}


	@Override
	public String toString() {
		return "Email [mail_id=" + mail_id + ", email=" + email + ", created_date=" + created_date + ", user=" + user
				+ "]";
	}
	

}
