package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("abc")
public class RubyTeacher implements Teacher {
	@Autowired
	public IScheduleService scheduleService;

	@Override
	public String getDailyExcercise() {
		return "abcabscacas";
	}

	@Override
	public String getSchedule() {
		return scheduleService.getSchedule();
	}

}
