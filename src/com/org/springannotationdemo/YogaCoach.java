package com.org.springannotationdemo;

public class YogaCoach implements Coach {

	
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

}
