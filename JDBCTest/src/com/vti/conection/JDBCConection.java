package com.vti.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConection {
	public static Connection Connection() {
		final String url = "Jdbc:mysql://localhost:3306/TestJdbc";
		final String userName = "root";
		final String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			return DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		Connection c = Connection();
		if (c != null) {
			System.out.println("Thành công");  
		} else {
			System.out.println("Thất bại");
		}
	}
}
