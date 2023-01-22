package com.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Validator;

import com.dto.SoldierDTO;
import com.repo.SoldierRepo;

@Component
public class SoliderServiceImpl implements SoliderService {
	
	 
	 SoldierRepo repo;
	
	public SoliderServiceImpl() {
		System.out.println("Created Solider service implementations using no-arg const.....");
	}
	public void setRepo(SoldierRepo repo)
	{
		this.repo=repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("starting validateAndSave");
		System.out.println("dto passed:" +dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(dto);
		
		if(!violations.isEmpty())
		{
			System.out.println("There are errors...");
		
		
		violations.forEach(v->
		{
			System.err.println("Violating message " + v.getMessage());
		});
		
			return true;
	}else {
		System.out.println("data is valid..");
		boolean saved=repo.save(dto);
		System.out.println("Dto saved using repo"+saved);
		return saved;
	}

	}
}
