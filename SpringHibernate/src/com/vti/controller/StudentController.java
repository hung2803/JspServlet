/**
 * 
 */
package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: Jun 3, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: Jun 3, 2020
 */
@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public ModelAndView viewStudent() {
		ModelAndView mav = new ModelAndView("viewlist");
		List<Student> listStudent = service.viewList();
		mav.addObject("listStudent", listStudent);
		return mav;
	}
}
