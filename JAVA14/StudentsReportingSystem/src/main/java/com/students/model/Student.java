package com.students.model;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "student")
public class Student {
	
	@Id
	private String id;
	@Field(type = FieldType.Text,name="name")
	private String name;
	@Field(type=FieldType.Text,name="email")
	private String email;
	@Field(type=FieldType.Text,name="phone")
	private String phone;
	@Field(type=FieldType.Text,name="address")
	private String address;
	private List<Semester> semesters;
}
