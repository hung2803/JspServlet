/**
 * 
 */
package com.vti.controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: Jun 2, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: Jun 2, 2020
 */

public class TestConectJDBC {
	public static void main(String[] args) {

		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/FinalExam?useSSL=false&serverTimezone=UTC";
			String user = "root";
			String password = "root";
			System.out.println("Connecting to database: " + jdbcUrl);

			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}