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
public class PanCard extends Id_Card{
	private String phone_no;
}
