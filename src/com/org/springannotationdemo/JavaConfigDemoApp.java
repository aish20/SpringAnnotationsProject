package com.org.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//get the bean from the spring container
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call the method on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the new method of daily fortune method
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context 
		
		context.close();

	}

}
