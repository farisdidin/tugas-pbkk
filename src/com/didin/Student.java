package com.didin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements College {
	
	private Schedule schedule;
	
//	@Autowired
//	public Student(Schedule schedule) {
//		this.schedule = schedule;
//		
//	}



	public Schedule getSchedule() {
		return schedule;
	}



	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}



	@Override
	public void getGeneralInformation() {
		// TODO Auto-generated method stub
		System.out.println("Schedule : " + schedule);

	}

}
