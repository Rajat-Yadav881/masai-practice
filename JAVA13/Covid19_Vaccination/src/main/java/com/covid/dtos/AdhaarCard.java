package com.covid.dtos;

import com.covid.model.Id_Card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdhaarCard extends Id_Card{
	private Long adhaarNumber;
	private String fingerPrint;
	private String irisScan;
	
}
