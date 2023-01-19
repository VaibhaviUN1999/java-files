package com.repo;

import org.springframework.stereotype.Component;

import com.dto.FirstAidDTO;

@Component
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDTO dto) {
	    System.out.println(dto);
		return true;
		
	}

}
