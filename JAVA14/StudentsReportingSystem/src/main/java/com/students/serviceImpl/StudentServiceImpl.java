package com.students.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.students.model.Student;
import com.students.repository.StudentRepo;
import com.students.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo repo;
	@Override
	public Student addStudent(Student student){
		Student s1 = repo.save(student);
		return s1;

	}

}
