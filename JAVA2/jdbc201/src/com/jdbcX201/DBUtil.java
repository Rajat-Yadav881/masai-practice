package com.jdbcX201;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection provideConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		try
		{DriverManager.getConnection(url,"root","gammahulk@@@123"))}
			
			
		}catch(SQLException w) {
			w.printStackTrace();
		}
		
	}
}
