package com.students.service;

import com.students.exception.StudentException;

import com.students.model.Student;

public interface StudentService {
	public Student addStudent(Student student)throws StudentException;
	
}
