package com.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dto.FirstAidDTO;
import com.dto.MissileDTO;
import com.dto.ResortDTO;
import com.service.FirstAidService;
import com.service.MissileService;
import com.service.ResortService;

import configuration.SoliderConfiguration;


public class AllRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SoliderConfiguration.class);
		FirstAidService service = spring.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println(saved);
		
		MissileService service1 = spring.getBean(MissileService.class);
		boolean saved1 = service1.validateAndSave1(new MissileDTO());
		System.out.println(saved1);
		
		ResortService service2 = spring.getBean(ResortService.class);
		boolean saved2 = service2.validateAndSave(new ResortDTO());
		System.out.println(saved1);
		
		
		
	}
}


