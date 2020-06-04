package com.example.student;

import org.springframework.stereotype.Component;

// @Component("javaTeacher")
public class JavaTeacher implements Teacher {
	private IScheduleService scheduleService;

	/**
	 * Constructor for class JavaTeacher.
	 * 
	 * @Description: .
	 * @author: NTHung
	 * @create_date: May 28, 2020
	 * @version: 1.0
	 * @modifer: NTHung
	 * @modifer_date: May 28, 2020
	 * @param iSchedeleService
	 */

	public JavaTeacher(IScheduleService iSchedeleService) {
		this.scheduleService = iSchedeleService;
	}

	/**
	 * Constructor for class JavaTeacher.
	 * 
	 * @Description: .
	 * @author: NTHung
	 * @create_date: May 28, 2020
	 * @version: 1.0
	 * @modifer: NTHung
	 * @modifer_date: May 28, 2020
	 * @param iSchedeleService
	 */

	@Override
	public String getDailyExcercise() {

		return "blabla";
	}

	@Override
	public String getSchedule() {
		
		return scheduleService.getSchedule();
	}

}
