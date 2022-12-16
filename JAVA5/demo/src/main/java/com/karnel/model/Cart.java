package com.karnel.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;

	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	@ElementCollection
	private List<ProductDTO> products = new ArrayList<>();
}
