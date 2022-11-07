package com.assignment.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assignment.Utility.DBUtil;
import com.assignment.model.Department;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public String setByDepartment(Department department) {
		String message = "not Inserted...!";
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into department(did,dname,location) values(?,?,?)");
			
			ps.setInt(1, department.getDid());
			ps.setString(2, department.getDname());
			ps.setString(3, department.getLocation());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Successfully Inserted...!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public String deleteDepartment(int did) {
		String message = "data not deleted...!";
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("delete from department where did = ?");
			ps.setInt(1, did);
			int rs = ps.executeUpdate();
			if(rs>0) {
				message = "data deleted successfully...!";
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return message;
	}

}
