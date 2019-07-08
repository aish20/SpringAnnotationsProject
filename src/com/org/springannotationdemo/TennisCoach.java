package com.org.springannotationdemo;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// when spring scan the packages it will gonna find this class and it will automatically register this bean with the spring container and uses the bean id of thatSillyCoach 
// so this id will help us to later time retrieve this bean from the spring container
@Component
public class TennisCoach implements Coach {

	//Here Spring will gonna scan for the component that implements FortuneService Interface 
	// eg - in our case HappyFortuneService now spring will create instance of it and inject it into our tennis coach
	//@Autowired
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
