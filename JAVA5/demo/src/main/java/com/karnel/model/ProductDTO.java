package com.karnel.model;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class ProductDTO {

	private Integer productId;

	private String productName;

	private Double price;

	private String colour;

	private String dimension;

	private String manufacturer;

	private Integer quantity;

}