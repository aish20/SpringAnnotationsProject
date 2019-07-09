package com.org.springannotationdemo;

import java.io.ObjectInputStream.GetField;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// when spring scan the packages it will gonna find this class and it will automatically register this bean with the spring container and uses the bean id of thatSillyCoach 
// so this id will help us to later time retrieve this bean from the spring container
@Component
public class TennisCoach implements Coach {
	
	//Field Injection even if this field is private it will still inject the dependencies.
	// What spring will gonna do is it will create the constructor first and then actually inject the dependencies ie., fortune service into the class making use of reflection  
	//@Autowired
	//@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	//Here Spring will gonna scan for the component that implements FortuneService Interface 
	// eg - in our case HappyFortuneService now spring will create instance of it and inject it into our tennis coach
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
public  TennisCoach() {
	
	System.out.println("inside the default constructor");
}



// define my init method
@PostConstruct
public void doMyStartUpStuff()

{
	System.out.println("Tennis Coach inside do my startup stuff");
}

// define my destroy method

@PreDestroy
public void endWithThisMethod()
{
	System.out.println("Tennis Coach do my clean up stuff");
}




	
// using and testing @Qualifier with the constructor

@Autowired
public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService)
{
	System.out.println("Inside parametrised constructor");
	
	this.fortuneService = fortuneService;
}
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
	 * System.out.println("Inside doSomeCrazyStuff for setter injection");
	 * fortuneService = theFortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
