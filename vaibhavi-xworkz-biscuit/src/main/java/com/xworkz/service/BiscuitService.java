package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.BiscuitDTO;

public interface BiscuitService {

	

		   Set<ConstraintViolation<BiscuitDTO>> saveAndValidate(BiscuitDTO dto);
		   
		   BiscuitDTO findById(int id);
		}

