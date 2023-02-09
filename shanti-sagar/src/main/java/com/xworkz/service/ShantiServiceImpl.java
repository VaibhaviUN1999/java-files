package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.ShantiDto;
import com.xworkz.repositery.ShantiRepo;

@Service
public class ShantiServiceImpl implements ShantiService {
	
	@Autowired
	private ShantiRepo repo;
	
	public ShantiServiceImpl()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean saveAndValidate(ShantiDto dto) {
		System.out.println("started save and validate");
		boolean saved=this.repo.save(dto);
		System.out.println(saved);
		return false;
	}
	
	

}
