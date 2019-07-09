package com.org.springannotationdemo;

public class WrestlingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		return "ok so you have to work hard";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
