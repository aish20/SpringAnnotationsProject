package com.org.springannotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	public PingPongCoach() {
		
		System.out.println("New Constructor ping pong coach");
		}
	
	
	@Override
	public String getDailyWorkout() {

		return "Ping Pong is returning a lot ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
