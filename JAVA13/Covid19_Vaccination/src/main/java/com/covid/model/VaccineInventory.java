package com.covid.model;

import java.time.LocalDate;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class VaccineInventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer vaccineInventoryId;
	private LocalDate date;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<VaccineCount> countLst;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private VaccinationCenter center;
}
