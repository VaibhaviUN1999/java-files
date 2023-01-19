package com.repo;

import org.springframework.stereotype.Component;

import com.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo{

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Started resort DTO..........");
		System.out.println(dto);
		return true;
	}

}
