package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.CMDto;

public interface CMService {

	Set<ConstraintViolation<CMDto>> validateAndSave(CMDto dto);
}
