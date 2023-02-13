package com.xworkz.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.CMDto;
import com.xworkz.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	
	@Autowired
	private CMService service;
	
	public CMController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCm(CMDto dto,Model model)
	{
		System.out.println("running onCM"+dto);
		
		Set<ConstraintViolation<CMDto>> constraintViolations = this.service.validateAndSave(dto);
		
		return "cm";
	}
	

}
