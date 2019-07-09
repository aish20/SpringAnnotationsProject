package com.org.springannotationdemo;

import org.springframework.beans.factory.annotation.Value;

public class YogaCoach implements Coach {

	@Value("${foo.email}")
	private String emailAddress;
	
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	
	public YogaCoach(FortuneService fortuneService) {
		
		this.fortuneService= fortuneService;
		
	}
	@Override
	public String getDailyWorkout() {
		
		return "Swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
}
