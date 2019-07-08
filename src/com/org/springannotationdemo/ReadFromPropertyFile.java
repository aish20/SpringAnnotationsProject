package com.org.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadFromPropertyFile {

	public static void main(String[] args) {
		
		//read spring config file
		
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		
// why we are using Swimcoach instead of Coach because SwimCoach has all the methods ie., 
// getTeam and getEmailAddress
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call the method on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the new method of daily fortune method
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email Add = "+theCoach.getEmailAddress());
		
		System.out.println("Team name = "+theCoach.getTeam());
		
		//close the context 
		
		context.close();
		
	}

}
