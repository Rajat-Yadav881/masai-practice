package com.masai.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Data
@Document(indexName = "product")
public class Student {
	
	@Id
	private Integer roll;
	private String name;
	private String address;
	private Integer marks;

	
	
}
