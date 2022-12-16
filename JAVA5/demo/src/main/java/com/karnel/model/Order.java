package com.karnel.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private LocalDate orderDate;
	private String orderStatus;
	private String location;
	
	@ManyToOne
	private Customer customer;
	
	@ElementCollection
	private List<ProductDTO>productdtoList = new ArrayList<>();
	
	private Double total;
	
	@OneToOne
	private Address address;
}
