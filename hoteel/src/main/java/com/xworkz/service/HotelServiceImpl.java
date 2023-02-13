package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.OrderDTO;
import com.xworkz.repositery.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	public HotelServiceImpl() {
		System.out.println("Running Hotel Service Implementation");
	}

	@Override
	public boolean validateAndSave(OrderDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("Running Validate And Save Method");
		boolean save = this.hotelRepository.save(dto);
		System.out.println("Saved " + save);
		return false;
	}
}
