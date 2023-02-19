package com.students.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "semester")
public class Semester {
	
	@Id
	private Integer semesterNumber;
	private String subject;
	private Integer marks;
	private Student student;
}
