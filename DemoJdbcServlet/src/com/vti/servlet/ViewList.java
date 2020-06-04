package com.vti.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/Students")
public class ViewList extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/student_demo_database")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewList() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text.html");

		Connection myConn = null;
		Statement myStatement = null;
		ResultSet myResultSet = null;

		try {

			// connect database
			myConn = dataSource.getConnection();
			String sql = "SELECT * FROM student" + "";
			ArrayList<Student> students = new ArrayList<Student>();

			myStatement = myConn.createStatement();

			myResultSet = myStatement.executeQuery(sql);

			while (myResultSet.next()) {
				String idStr = myResultSet.getString("id");
				String firstname = myResultSet.getString("firstname");
				String lastname = myResultSet.getString("lastname");
				String email = myResultSet.getString("email");
				int id = Integer.parseInt(idStr);
				students.add(new Student(id, firstname, lastname, email));
			}
			request.setAttribute("listStudent", students);
			RequestDispatcher view = request.getRequestDispatcher("/Student.jsp");
			view.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				myConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
