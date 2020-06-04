/**
 * 
 */
package com.vti;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
public class AuthController {
	@RequestMapping("/login")
	public String getLoginForm() {
		return "/view/login.jsp";
	}

	@RequestMapping(value = "/login_action", method = RequestMethod.POST)
	public void checkCreds(@RequestParam("userName") String unm, @RequestParam("password") String pass,
			HttpServletRequest req, HttpServletResponse res) throws IOException {

		if (unm.equals("admin") && pass.equals("a")) {

			req.getSession().setAttribute("userName", unm);
			res.sendRedirect("dashboard");
		} else {
			res.sendRedirect("login");
		}

	}

	public void logoutAdmin(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		req.getSession().invalidate();
		res.sendRedirect("login");
	}

}
