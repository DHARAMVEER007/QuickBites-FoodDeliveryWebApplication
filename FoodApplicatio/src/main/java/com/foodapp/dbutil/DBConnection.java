package com.foodapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con;

	public static Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Dharam@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	
}