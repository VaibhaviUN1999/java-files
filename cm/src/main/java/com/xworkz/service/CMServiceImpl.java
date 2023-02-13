package com.xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import com.xworkz.dto.CMDto;
import com.xworkz.repositery.CMRepo;

@Service
public class CMServiceImpl  implements CMService{
	
	@Autowired
	private CMRepo repo;

	@Override
	public Set<ConstraintViolation<CMDto>> validateAndSave(CMDto dto) {
		System.out.println("running validateANdSave");
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator=factory.getValidator();
		Set<ConstraintViolation<CMDto>> constraintViolations=validator.validate(dto);
		if(constraintViolations !=null && !constraintViolations.isEmpty())
		{
			System.err.println("constraintViolations exist,return ConstraintViolations");
			return constraintViolations;
		}
		else
		{
			System.out.println("constraint violations does not exist");
			boolean save=this.repo.save(dto);
			return Collections.emptySet();
		}
		
	}
	

}
