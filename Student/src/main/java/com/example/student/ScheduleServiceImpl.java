package com.example.student;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceImpl implements IScheduleService {

	@Override
	public String getSchedule() {

		return "Thu 2 duoc nghi hoc";
	}

}
