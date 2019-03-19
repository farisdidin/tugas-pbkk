package com.didin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		
		College college = context.getBean("lec1", College.class);
		
		College college2 = context.getBean("stu1", College.class);
		
		college.getGeneralInformation();
		college2.getGeneralInformation();
		
		

	}

}
