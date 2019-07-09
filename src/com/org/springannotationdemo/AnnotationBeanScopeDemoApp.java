package com.org.springannotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retreive bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		// check if they are the same objects
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("result is "+result);
		
		System.out.println("pointing the memory location "+theCoach);
		
		System.out.println("memory location "+alphaCoach);
		
		context.close();
		

	}

}
