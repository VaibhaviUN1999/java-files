package com.xworkzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Producer;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	@Autowired
	private Experience experience;
	
	
	public void n()
	{
		System.out.println("created director object");
		
		System.out.println(director.hashCode());
		System.out.println("created camera object");
		System.out.println(experience.hashCode());
		
	}
	
	
	  

}
