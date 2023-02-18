package com.students.model;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "semester")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Semester {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer semId;
	private Integer semesterNumber;
	private String subject;
	private Integer marks;
	
	@ManyToMany(fetch = FetchType.LAZY)
	
	private Student student;
}
