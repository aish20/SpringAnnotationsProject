package com.org.springannotationdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	// create an array of strings
	
	private String[] data = {"ABC","XYZ","VBN,CMN"};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		// pick a random string from the array
		return theFortune;
	}

}
