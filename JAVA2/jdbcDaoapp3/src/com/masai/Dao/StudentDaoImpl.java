package com.masai.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.Exception.StudentException;
import com.masai.model.Student;
import com.masai.utility.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String registerStudent(Student student) throws StudentException {
		String result = "not inserted";
		try (Connection conn =  DBUtil.provideConnection()){
		
			
			PreparedStatement ps =  conn.prepareStatement("insert into student(name,address,email,password) values(?,?,?,?)");
			
			ps.setString(1, student.getName());
			ps.setString(2,student.getAddress());
			ps.setString(3, student.getemail);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StudentException()e.getMessage()
		}
		return result;
	}

}
