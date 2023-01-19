package com.repo;

import com.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	
	public SoldierRepoImpl()
	{
		System.out.println("Created SoliderRepoImpl using NoArgs");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("running save");
		System.out.println("Dto" + dto);
		return true;
	}

}
