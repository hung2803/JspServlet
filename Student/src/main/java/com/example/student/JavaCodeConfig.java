/**
 * 
 */
package com.example.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

public class JavaCodeConfig {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BaseConfig.class);
		Teacher rubyTeacher = context.getBean("getJavaTeacherObject", Teacher.class);

		System.out.println(rubyTeacher.getDailyExcercise());
		System.out.println(rubyTeacher.getSchedule());

	}
}