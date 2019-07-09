package com.org.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadFromTextFile {

	public static void main(String[] args) {
		
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the spring container
		
// why we are using Swimcoach instead of Coach because SwimCoach has all the methods ie., 
// getTeam and getEmailAddress
		Coach theCoach = context.getBean("pingPongCoach",Coach.class);
		
		//call the method on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the new method of daily fortune method
		
		System.out.println("File having value "+theCoach.getDailyFortune());
		
		//close the context 
		
		context.close();
		
		
		
		
	}

}
