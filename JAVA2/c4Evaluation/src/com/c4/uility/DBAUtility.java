package com.c4.uility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAUtility {
	public static Connection provideConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/tabular1";
		
		try {
			conn = DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
