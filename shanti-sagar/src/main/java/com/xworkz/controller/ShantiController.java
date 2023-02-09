package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ShantiDto;
import com.xworkz.service.ShantiService;

@Controller
@RequestMapping("/")
public class ShantiController {
	
	@Autowired
	private ShantiService service;
	
	public ShantiController()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@GetMapping("/shanti")
	public String getShanti(ShantiDto dto,Model model)
	{
		System.out.println("created.........");
		System.out.println(dto);
		boolean saved=this.service.saveAndValidate(dto);
		System.out.println(saved);
	    model.addAttribute("hdto"+dto);
		return "index";
	}
	

}
