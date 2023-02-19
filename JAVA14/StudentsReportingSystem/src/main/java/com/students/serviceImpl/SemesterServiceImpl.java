package com.students.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.students.model.Semester;
import com.students.repository.SemesterRepo;
import com.students.repository.StudentRepo;
import com.students.service.SemesterService;
@Service
public class SemesterServiceImpl implements SemesterService{
	
	@Autowired
	private SemesterRepo repo;
	
	@Override
	public Semester addSemester(String email, Semester semester)  {
		Semester semester2 = repo.save(semester);
		return semester2;
	}

}
