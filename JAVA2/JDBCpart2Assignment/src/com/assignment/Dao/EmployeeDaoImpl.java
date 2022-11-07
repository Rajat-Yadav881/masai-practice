package com.assignment.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assignment.Utility.DBUtil;
import com.assignment.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String registerEmployee(Employee employee) {
		String message = "not inserted..";
		
		try(Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert into employee(empid,ename,address,mobile,deptid) values(?,?,?,?,?)");
			ps.setInt(1, employee.getEmpid());
			ps.setString(2, employee.getEname());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getMobile());
			ps.setInt(5,employee.getDeptid() );
			int x=  ps.executeUpdate();
			
			if(x>0)
				System.out.println("data Inserted successfully...");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
	}

//	@Override
//	public Employee getByEmployee1(String dname) {
//		Employee employee = null;
//		
//		
//		try(Connection conn = DBUtil.provideConnection()) {
//			PreparedStatement ps = conn.prepareStatement("select * from employee inner join department d where d.dname = ?");
//			
//			ps.setInt(1, );
//			ResultSet rs =  ps.executeQuery();
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return employee;
//	}

	@Override
	public Employee getByEmployee(String dname) {
		Employee employee = null;
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select e.empid,e.ename,e.address,e.mobile,e.deptid from employee e inner join department d where d.dname = ?");
			ps.setString(1, dname);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int empid = rs.getInt("empid");
				String ename = rs.getString("ename");
				String address = rs.getString("address");
				String mobile = rs.getString("mobile");
				int deptid = rs.getInt("deptid");
				
				employee = new Employee(empid,ename,address,mobile,deptid);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

}
