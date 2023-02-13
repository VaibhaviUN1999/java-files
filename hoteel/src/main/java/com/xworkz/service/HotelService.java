package com.xworkz.service;

import com.xworkz.dto.OrderDTO;

public interface HotelService {

	boolean validateAndSave(OrderDTO dto);

}