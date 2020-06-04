/**
 * 
 */
package com.vti.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class is TestController.
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 27, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 27, 2020
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String showHomePage() {
		return "home-page";
	}
}