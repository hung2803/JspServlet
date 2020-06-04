/**
 * 
 */
package com.vti;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vti.db.HibernateConection;

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
@Controller
public class DashboardController {
	@RequestMapping("/dashboard")
	public String loadDashBoard(Model m, HttpServletRequest req, HttpServletResponse res) throws IOException {
		String userName = (String) req.getSession().getAttribute("userName");
		if (userName == null) {
			res.sendRedirect("login");
		}

		Session session = null;

		session = HibernateConection.getSessionFactory().openSession();

		Query query = session.createQuery("FROM Student");
		List student = query.list();
		m.addAttribute("student_list", student);
		System.out.println(student);
		return "view/dashboard.jsp";
	}
}
