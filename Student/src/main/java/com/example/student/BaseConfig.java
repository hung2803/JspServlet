package com.example.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This class is .
 * 
 * @Description: .
 * @author: NTHung
 * @create_date: May 28, 2020
 * @version: 1.0
 * @modifer: NTHung
 * @modifer_date: May 28, 2020
 */
@Configuration
@ComponentScan(basePackages = "com.example.student")
public class BaseConfig {
	@Bean
	public IScheduleService getISchedeleService() {
		return new ScheduleServiceImpl();
	}

	@Bean
	public Teacher getJavaTeacherObject() {
		JavaTeacher javatecher = new JavaTeacher(getISchedeleService());
		return javatecher;
	}
}
