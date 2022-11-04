package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the grace marks : ");
//		int gmarks = sc.nextInt();
		System.out.print("Enter the roll number : ");
		int roll = sc.nextInt();
		try {
			Class.forName("com.pack1.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try(Connection conn = DriverManager.getConnection(url,"root","gammahulk@@@123")) {
//			PreparedStatement ps = conn.prepareStatement("update student set marks = marks + ? where marks < 800");
			PreparedStatement ps = conn.prepareStatement("delete from student where roll = ?");
//			ps.setInt(1, gmarks);
//			int x = ps.executeUpdate();
//			if(x>0) {
//				System.out.println(x+" records are updates successfully");
//			}else {
//				System.out.println("no record updated...");
//			}
			ps.setInt(1,roll);
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println(x+" records deleted successfully");
			}else {
				System.out.println("no record deleted...");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
