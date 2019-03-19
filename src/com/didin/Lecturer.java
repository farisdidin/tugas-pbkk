package com.didin;

public class Lecturer implements College {
	
	private String name;
	private String gender;
	private Schedule schedule;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
// name, gender, schedule
	@Override
	public void getGeneralInformation() {
		// TODO Auto-generated method stub
		
		System.out.println("Name : " + name + ", gender = " + gender + ", Schedule : " + schedule);

	}

}
