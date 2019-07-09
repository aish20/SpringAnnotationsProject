package com.org.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.org.springannotationdemo")
@PropertySource("classpath:sports.properties")
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
