package com.c4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.c4.model.Employee;
import com.c4.uility.DBAUtility;

import ExceptionPack.DepartmentException;
import ExceptionPack.EmployeeException;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String setEmployee(Employee employee) throws EmployeeException {
		String message = "not Inserted...!";
		
		try(Connection conn = DBAUtility.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee(ename,address,email,password,salary) values(?,?,?,?,?)");
			
			ps.setString(1, employee.getEname());
			ps.setString(2, employee.getAddress());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getPassword());
			ps.setInt(5, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "inserted Successfully...!";
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new EmployeeException("Error in employee");
		}
		
		
		return message;
	}

	@Override
	public Employee checkEmpDept(String dname) throws EmployeeException {
Employee employee = null;
		
		try (Connection conn = DBAUtility.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select e.empid,e.ename,e.address,e.email,e.password,e.salary,e.deptid from employee e inner join department d where d.dname = ?");
			ps.setString(1, dname);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int empid = rs.getInt("empid");
				String ename = rs.getString("ename");
				String address = rs.getString("address");
				String email = rs.getString("email");
				String password = rs.getString("password");
				int salary = rs.getInt("salary");
				int deptid = rs.getInt("deptid");
				
				employee = new Employee(empid,ename,address,email,password,salary,deptid);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			throw new EmployeeException("Error init>>>");
		}
		return employee;
	}

	@Override
	public Employee login(String email, String password) {
		Employee employee = null;

		
			try (Connection conn= DBAUtility.provideConnection()){
				
				
				PreparedStatement ps= conn.prepareStatement("select * from employee where email=? AND password = ?");
				
				
				ps.setString(1, email);
				ps.setString(2, password);
				
				ResultSet rs= ps.executeQuery();
				
				if(rs.next())
				{
					int r= rs.getInt("empid");
					String n= rs.getString("ename");
					String a= rs.getString("address");
					String e= rs.getString("email");
					String p= rs.getString("password");
					int s= rs.getInt("salary");
					int d= rs.getInt("deptid");
					
					employee= new Employee(r, n, a, e, p,s,d);
					
				}else
					throw new EmployeeException("Invalid Username or password..");
				
				
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				throw new EmployeeException(e.getMessage());
			}
			
			
			
			
			
			
			
			
			return employee;
			
		}

	}

}
