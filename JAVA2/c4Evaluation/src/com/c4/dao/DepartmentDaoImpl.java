package com.c4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.c4.model.Department;
import com.c4.uility.DBAUtility;

import ExceptionPack.DepartmentException;

//import ExceptionPack.DepartmentException;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public String setDepartment(Department department) throws DepartmentException{
		String message = "Not Inserted...!";
		
		try(Connection conn = DBAUtility.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into department(dname,location) values(?,?)");
			
			ps.setString(1, department.getDname());
			ps.setString(2, department.getLocation());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "Inserted Successfully...!";
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new DepartmentException("Invalid Error");
			
		}
		
		return message;
	}

	@Override
	public List<Department> allDept() throws DepartmentException {
		List<Department> arr = new ArrayList<>();
		
		try(Connection conn = DBAUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from department");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Department dto = new Department();
				dto.setDid(rs.getInt("did"));
				dto.setDname(rs.getString("dname"));
				dto.setLocation(rs.getString("location"));
				
				
				
				arr.add(dto);
				
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new DepartmentException("error in the query>>!");
		}
		
		return arr;
	}

}
