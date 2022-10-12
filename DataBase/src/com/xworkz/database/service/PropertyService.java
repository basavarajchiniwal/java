package com.xworkz.database.service;

import com.xworkz.database.dto.PropertyDTO;

public interface PropertyService {
	
	boolean validateAndSave(PropertyDTO dto);

}
