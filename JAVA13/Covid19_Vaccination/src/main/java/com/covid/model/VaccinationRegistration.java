package com.covid.model;

import java.time.LocalDate;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class VaccinationRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mobileNo;
	private LocalDate dateOfRegistration;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	private List<Member> productList;
	
}
