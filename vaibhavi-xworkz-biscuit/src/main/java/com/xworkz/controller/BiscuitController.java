package com.xworkz.controller;



	
	import java.util.Arrays;
	import java.util.List;
	import java.util.Set;

	import javax.validation.ConstraintViolation;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.BiscuitDTO;
import com.xworkz.service.BiscuitService;

	

	@Controller
	@RequestMapping("/")
	public class BiscuitController {

		@Autowired
		public BiscuitService aeroplaneService;
		
		public BiscuitController() {
			System.out.println("Created "+this.getClass().getSimpleName());
		}
		
		private List<String> type = Arrays.asList("Chocolatey","Spicy","Sour");
		
		private List<String> color = Arrays.asList("Brown" , "Orange" , "Pink");
			
		@GetMapping("/rese")
		public String onAeroplane(Model model) {
			System.out.println("Running onAeroplane on getmapping");
			model.addAttribute("type",type);
			model.addAttribute("color", color);
			return "Register"; 
		}
		
		@PostMapping("/rese")
		public String onAeroplane(BiscuitDTO dto , Model model) {
		   Set<ConstraintViolation<BiscuitDTO>> constraintViolations = this.aeroplaneService.saveAndValidate(dto);
		    if(constraintViolations.isEmpty()) {
		    	System.out.println("Data Entered Sucessfully");
		    	System.out.println(dto);
		    	return "Register";
		    }
		   model.addAttribute("type", type);
		   model.addAttribute("color",color);
		    
		   model.addAttribute("constraintViolations",constraintViolations);
		   System.out.println(dto);
		   
		   System.err.println("violations in controller");
		   model.addAttribute("error",constraintViolations);
		 
		   return "Register";
		}	
		
		@GetMapping("/search")
		public String onSearch(@RequestParam int id , Model model) {
			
			System.out.println("Running on search for id "+id);
			
			BiscuitDTO dto = this.aeroplaneService.findById(id);
			if(dto!=null) {
				model.addAttribute("dto",dto);
			}else {
				model.addAttribute("message","Data not found"); 
			}
			return "BiscuitSearch";
		}
	}
