package com.org.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YogaJavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//Step 3 read spring config file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//get the bean from the spring container
		
		YogaCoach theCoach = context.getBean("yogaCoach",YogaCoach.class);
		
		//call the method on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the new method of daily fortune method
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("email id ="+theCoach.getEmailAddress());
		
		System.out.println("team ="+theCoach.getTeam());
		
		//close the context 
		
		context.close();

	}

}
