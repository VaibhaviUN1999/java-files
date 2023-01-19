package com.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.MissileDTO;
import com.repo.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService {
	
	@Autowired
	private MissileRepo repo;
	@Autowired
	private Validator validator;
	
	@Autowired
	public MissileServiceImpl(MissileRepo repo,Validator validator)
	{
		this.repo=repo;
		this.validator=validator;
	}
	
	
	@Override
	public boolean validateAndSave1(MissileDTO dto) {
		System.out.println("starts validation of missile.......");
		System.out.println("DTO" + dto);
		Set<ConstraintViolation<MissileDTO>>violence=validator.validate(dto);
		violence=validator.validate(dto);
		if(!violence.isEmpty())
		{
			System.out.println("error in data");
			violence.forEach(ele->
			System.err.println(ele.getMessage()));
			return false;
		}else {
			System.out.println("no violence");
			boolean saved=repo.save(dto);
			System.out.println("saved" + saved);
			return true;
			
			
		}
		
	}

}
