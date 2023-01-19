package com.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.FirstAidDTO;
import com.repo.FirstAidRepo;


	
	@Component
	public class FirstAidServiceImpl implements FirstAidService {
		
		
		@Autowired
		private FirstAidRepo firstAidRepositery;
		@Autowired
		private Validator validator;

		@Autowired
		public FirstAidServiceImpl(FirstAidRepo firstAidRepositery) {
			super();
			this.firstAidRepositery = firstAidRepositery;
		}

		/*public void setFirstAidRepositery(FirstAidRepo firstAidRepositery) {
			this.firstAidRepositery = firstAidRepositery;
		}*/


		@Override
		public boolean validateAndSave(FirstAidDTO dto) {
			// TODO Auto-generated method stub
			
			
			System.out.println("data started to validate in FirstAid");
			System.out.println("dto---" + dto);
			Set<ConstraintViolation<FirstAidDTO>> violense = this.validator.validate(dto);
			if (!violense.isEmpty()) {
				System.err.println("there is error");
				violense.forEach(ele -> System.err.println(ele.getMessage()));
				return false;
			} else {
				System.out.println("there is no error ");
				boolean saved = this.firstAidRepositery.save(dto);
				System.out.println("data saved" + saved);
				return saved;
			}

		}

	}
			
		
		