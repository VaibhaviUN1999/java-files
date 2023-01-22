package com.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.ResortDTO;
import com.repo.ResortRepo;

@Component
public class ResortServiceImpl  implements ResortService{
	
	@Autowired
	private ResortRepo repo;
	@Autowired
	private Validator validator;
	
	@Autowired
	public ResortServiceImpl(ResortRepo repo,Validator validator)
	{
		
		this.repo=repo;
		this.validator=validator;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("Resort Service Implementation started");
		System.out.println(dto);
		Set<ConstraintViolation<ResortDTO>>violence=validator.validate(dto);
		if(!violence.isEmpty())
		{
			System.err.println("there are errors");
			violence.forEach(ele->System.err.println(ele.getMessage()));
			return true;
			 
		}else {
			System.out.println("there are no errors....");
			boolean saved=repo.save(dto);
			System.out.println(saved);
			return saved;
		}
		
		
		
	}

}
