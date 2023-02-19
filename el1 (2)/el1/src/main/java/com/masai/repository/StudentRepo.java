package com.masai.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.masai.model.Student;

public interface StudentRepo extends ElasticsearchRepository<Student, Integer>{
	
	

}
