package com.org.springannotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WrestlerJavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		//Step 3 read spring config file
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WrestlersSportsConfig.class);
		
		
		//get the bean from the spring container
		
		Coach theCoach = context.getBean("wrestlingCoach",Coach.class);
		
		//call the method on the bean 
		
		System.out.println(theCoach.getDailyWorkout());
		
		//call the new method of daily fortune method
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		//close the context 
		
		context.close();

	}

}
