package com.Oden;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

//import java.sql.DriverManager;
//import java.sql.SQLException;
public class Demo101 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Roll: ");
		int roll = sc.nextInt();
		
		System.out.print("Enter Name: ");
		String name = sc.next();
		
		System.out.print("Enter Marks: ");
		int marks = sc.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		//loading the related main class into the jar file
//		try {
//			com.mysql.cj.jdbc.Driver d = new Driver();
//			DriverManager.registerDriver(d);
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//localhost is the ip adress of our computer
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
	
		try (Connection conn = DriverManager.getConnection(url,"root","gammahulk@@@123")){
			
			Statement st = conn.createStatement();
//			int x = st.executeUpdate("insert into student values("+roll+",'"+name+"',"+marks+")");
//			
//			if(x>0) {
//				System.out.println(x + "recordes inserted Successfully...!");
//			}else {
//				System.out.println("insertion Fail..");
//			}
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			
			ps.setInt(1,roll);
			ps.setString(2,name);
			ps.setInt(3, marks);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println(x + "recordes inserted Successfully...!");
			}else {
				System.out.println("insertion Fail..");
			}
//			if(conn!=null) {
//				System.out.println("Connected");
//			}else {
//				System.out.println("not Connected");
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//now setting the closing condition
		
	}
//	public static void main(String[] args) {
//		try {
//			Class.forName("com.Oden.A");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}