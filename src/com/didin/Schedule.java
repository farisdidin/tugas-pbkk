package com.didin;

public class Schedule {
	
	public String day;
	public String place;
	public String course;
	
	
	public Schedule() {
		super();
	}



	public Schedule(String day, String place, String course) {
		
		this.day = day;
		this.place = place;
		this.course = course;
	}



	public String getDay() {
		return day;
	}



	public void setDay(String day) {
		this.day = day;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	@Override
	public String toString() {
		return "Schedule [day=" + day + ", place=" + place + ", course=" + course + "]";
	}



	

}
