package com.xworkz.database.service;

import com.xworkz.database.dto.GarageDTO;

public interface GarageService {
	
	boolean validateAndSave(GarageDTO dto);

}
