package com.covid.model;

import java.time.LocalDate;

import com.covid.dtos.Slot;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookingId;
	private Long mobileNo;
	private LocalDate dateOfBooking;
	
	
	private Slot slot;
	
	
	private Boolean bookingStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	private VaccinationCenter center;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Member member;
}
