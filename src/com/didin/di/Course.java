package com.didin.di;

public class Course {
	String name;
	int sks;
	public Course() {
		
	}
	public Course(String name, int sks) {
		
		this.name = name;
		this.sks = sks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSks() {
		return sks;
	}
	public void setSks(int sks) {
		this.sks = sks;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", sks=" + sks + "]";
	}
	
	
}
