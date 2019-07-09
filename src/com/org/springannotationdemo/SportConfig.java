package com.org.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.org.springannotationdemo")
public class SportConfig {

	
	
	// Step 1 define bean for our sadfortuneservice
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	//define our bean for our yogacoach and inject dependency
	
	@Bean
	public Coach yogaCoach()
	
	{
		// step 2 Inject bean dependencies
		return new YogaCoach(sadFortuneService());
	}
}
