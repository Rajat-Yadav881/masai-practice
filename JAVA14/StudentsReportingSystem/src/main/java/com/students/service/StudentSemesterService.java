package com.students.service;

import java.util.List;

import com.students.model.Student;

public interface StudentSemesterService {
	public double getAveragePercentageOfRecentSemester();
	
	public double getAverageMarksInSubject(String subject);
	
	public List<Student> getTop2ConsistentStudents();
}
