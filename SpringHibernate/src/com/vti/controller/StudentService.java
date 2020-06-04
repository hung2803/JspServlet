/**
 * 
 */
package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

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
@Service
public class StudentService {
	@Autowired
	private StudentRepository reponsitory;


	public List<Student> viewList() {
		return (List<Student>) reponsitory.findAll();
	}

}
