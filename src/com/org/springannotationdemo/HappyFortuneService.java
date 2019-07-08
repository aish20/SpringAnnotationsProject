package com.org.springannotationdemo;

import org.springframework.stereotype.Component;


// because spring will scan our package and it will register all the components
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Your Lucky day is still far";
	}

}
