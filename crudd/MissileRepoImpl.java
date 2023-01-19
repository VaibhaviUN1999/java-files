package com.repo;

import org.springframework.stereotype.Component;

import com.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Missile Repo started.....");
		System.out.println("DTO" + dto);
		return true;
	}

}
