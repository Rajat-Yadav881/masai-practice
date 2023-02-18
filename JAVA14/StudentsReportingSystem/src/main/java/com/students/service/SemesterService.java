package com.students.service;

import com.students.exception.SemesterException;
import com.students.model.Semester;

public interface SemesterService {
	public Semester addSemester(Integer studentId,Semester semester)throws SemesterException;
	
}
