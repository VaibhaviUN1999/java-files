package com.xworkz.repositery;

import com.xworkz.entity.BiscuitEntity;

public interface BiscuitRepository {

	boolean save (BiscuitEntity entity);
	
	BiscuitEntity findById(int id);
}
