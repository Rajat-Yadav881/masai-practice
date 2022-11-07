package com.masai.Dao;

import com.masai.Exception.StudentException;

public interface StudentDao {
	public String registerStudent(Student student)throws StudentException;
}
