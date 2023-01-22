package com.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.FirstAidDTO;
import com.dto.MissileDTO;
import com.dto.ResortDTO;
import com.service.FirstAidService;
import com.service.MissileService;
import com.service.ResortService;
import com.service.ResortServiceImpl;

import configuration.SoliderConfiguration;


public class AllRunner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SoliderConfiguration.class);

		FirstAidService service = spring.getBean(FirstAidService.class);
		MissileService ser = spring.getBean(MissileService.class);
		ResortServiceImpl rdr = spring.getBean(ResortServiceImpl.class);

		FirstAidDTO d1 = new FirstAidDTO("Bandage",100,"India");
		boolean saved = service.validateAndSave(d1);
		System.out.println("Saved Data : " + saved);
		
		FirstAidDTO d2 = new FirstAidDTO("Scissors", 400,  "Korea");
		boolean saves = service.validateAndSave(d2);
		System.out.println("Saved Data : " + saves);
		
		MissileDTO m1 = new MissileDTO("Agni","Medium","India");
		boolean ms1 = ser.validateAndSave(m1);
		System.out.println("Saved Data : " + ms1);
		

		MissileDTO m2 = new MissileDTO("Sakshi","Large","Japan");
		boolean ms2 = ser.validateAndSave(m2);
		System.out.println("Saved Data : " + ms2);
		
		ResortDTO rd = new ResortDTO("Taj",600,"India");
		boolean rdm = rdr.validateAndSave(rd);
		System.out.println("Saved Data : " + rd);
		

		ResortDTO rd1 = new ResortDTO("Vivantha",1000,"Nepal");
		boolean rdm1 = rdr.validateAndSave(rd1);
		System.out.println("Saved Data : " + rdm1);
		
		

		
	}


		
		
		
		
		
	}



