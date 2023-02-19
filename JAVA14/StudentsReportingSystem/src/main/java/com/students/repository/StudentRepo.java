package com.students.repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.students.model.Student;

public interface StudentRepo extends ElasticsearchRepository<Student, Integer>{
	
	@Query("select s,AVG(se.marks) as avgMarks from Semester se join se.student s group by s.id order by avgMarks desc")
	List<Object[]> findStudentAvgMarks();
	
}
