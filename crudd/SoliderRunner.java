package com.boot;

import com.dto.SoldierDTO;
import com.repo.SoldierRepo;
import com.repo.SoldierRepoImpl;
import com.service.SoliderServiceImpl;

public class SoliderRunner {

	public static void main(String[] args) {
		
		SoldierDTO dto=new SoldierDTO("Vaibhavi",1,"Topper","Xworkz","Nepal Border");
		
		SoliderServiceImpl service=new SoliderServiceImpl();
		SoldierRepo repo=new SoldierRepoImpl();	
		service.setRepo(repo);
		service.validateAndSave(dto);
	}
}