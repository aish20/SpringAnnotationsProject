package com.org.springannotationdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "I am database class";
	}

}
