package com.xworkz.repositery;

import org.springframework.stereotype.Repository;

import com.xworkz.dto.ShantiDto;

@Repository
public class ShantiRepoImpl implements ShantiRepo {
	
	public ShantiRepoImpl()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	

	@Override
	public boolean save(ShantiDto dto) {
		System.out.println("started shantiRepoImpl.......");
		return false;
	}

}
