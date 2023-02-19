package com.students.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.students.model.Semester;

public interface SemesterRepo extends ElasticsearchRepository<Semester,Integer>{
	public Semester findByEmail(String email);
}
