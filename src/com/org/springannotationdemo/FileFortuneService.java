package com.org.springannotationdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName="C:/Users/aishwarya/eclipse-workspace-spring-updated/Spring-Annotations-demo/src/fortunedata.txt";
	
	private List<String> theFortunes = new ArrayList<String>();
	
	private Random theRandom = new Random();
	
	public FileFortuneService() {
	
		System.out.println("Inside Constructor of File Fortune and i am called first");
	}
	
	@PostConstruct
	public void  loadStuffWhileStart() {
		
		File file = new File(fileName);
		
		System.out.println("Created File "+file);

		System.out.println("file exist or not "+file.exists());
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String temp;
			
			while((temp = reader.readLine())!=null)
			{
				theFortunes.add(temp);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	@Override
	public String getFortune() {
		
		int index = theRandom.nextInt(theFortunes.size());
		
		String line =theFortunes.get(index);
		return line;
	}
	
	
	
	
	
	
	}
