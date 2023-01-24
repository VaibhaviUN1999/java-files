package com.xworkz.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Movies {
	@Autowired()
	@Qualifier("movie")
	private String movie;
	@Autowired()
	@Qualifier("talkies")
	private String talkies;
	@Autowired()
	@Qualifier("hero")
	private String hero;
	@Autowired()
	@Qualifier("heroine")
	private String heroine;
	@Autowired()
	@Qualifier("date")
	private LocalDate date;
	@Autowired()
	@Qualifier("ratings")
	private double ratings;
	@Autowired()
	@Qualifier("trp")
	private int trp;
	@Autowired()
	@Qualifier("budget")
	private double budget;
	@Autowired()
	@Qualifier("snacks")
	private boolean snacks;
	@Override
	public String toString() {
		return "Movies [movie=" + movie + ", talkies=" + talkies + ", hero=" + hero + ", heroine=" + heroine + ", date="
				+ date + ", ratings=" + ratings + ", trp=" + trp + ", budget=" + budget + ", snacks=" + snacks + "]";
	}
	
	
	
	
	

}
