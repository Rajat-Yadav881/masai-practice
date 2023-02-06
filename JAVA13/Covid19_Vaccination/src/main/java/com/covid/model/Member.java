package com.covid.model;

import java.time.LocalDate;

//import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer member_Id;
	private Boolean dose1Status;
	private Boolean dose2Status;
	private LocalDate dose1Date;
	private LocalDate dose2Date;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Id_Card card;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Vaccine vaccine;
	
	
}
