package com.xworkz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEnginner {
	@Autowired()
	@Qualifier("names1")
	private String name;
	@Autowired()
	@Qualifier("sal")
	private double salary;
	@Autowired()
	@Qualifier("companyNames")
	private String companyname;
	@Autowired()
	@Qualifier("expe")
	private Integer exp;
	
	
	@Override
	public String toString() {
		return "SoftwareEnginner [name=" + name + ", salary=" + salary + ", companyname=" + companyname + ", exp=" + exp
				+ "]";
	}
	
	
	

}
