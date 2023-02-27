package com.xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xworkz.dto.BiscuitDTO;
import com.xworkz.entity.BiscuitEntity;
import com.xworkz.repositery.BiscuitRepository;

@Service
public class BiscuitServiceImpl implements BiscuitService {

	@Autowired
	public BiscuitRepository biscuitRepository;
	
	public BiscuitServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	public Set<ConstraintViolation<BiscuitDTO>> saveAndValidate(BiscuitDTO dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<BiscuitDTO>> violations = validator.validate(dto);
		
		if(violations !=null && !violations.isEmpty()) {
			System.out.println("Violations in dto "+dto);
			return violations;
		}else {
			System.out.println("Violations is not there in dto can save");
			
			BiscuitEntity entity = new BiscuitEntity();
			
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setColor(dto.getColor());
			 
			boolean saved = this.biscuitRepository.save(entity);
			System.out.println("Entity Data is saved "+saved);
			return Collections.emptySet(); 
		}
	}

	public BiscuitDTO findById(int id) {
		if(id>0) {
			
			BiscuitEntity entity = this.biscuitRepository.findById(id);
			  if(entity!=null) {
				  System.out.println("Entity is found in service for id "+id);
				  
				  BiscuitDTO dto = new BiscuitDTO();
                   dto.setCompany(entity.getCompany());
				   dto.setName(entity.getName());
				   dto.setCost(entity.getCost());
				   dto.setType(entity.getType());
				   dto.setColor(entity.getColor());
				   dto.setId(entity.getId()); 
				  return dto;
			  }
			}
			return null;
	}

}
