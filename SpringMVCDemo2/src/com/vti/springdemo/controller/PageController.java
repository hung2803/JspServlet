/**
 * 
 */
package com.vti.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 30, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 30, 2020
 */
@Controller
@RequestMapping("test")
public class PageController {
	@RequestMapping("/page")
	public String showPage() {
		return "controller";
	}

	@RequestMapping("/view")
	public String showView(HttpServletRequest request) {
	
		return "showView";
	}
}
