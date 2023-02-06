package com.covid.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccineCount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineCountId;
	private Integer quantity;
	private Double price;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Vaccine vaccine;
}
