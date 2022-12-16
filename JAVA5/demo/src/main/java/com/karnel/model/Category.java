package com.karnel.model;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Category {

	private Integer catId;

	private String categoryName;

}
