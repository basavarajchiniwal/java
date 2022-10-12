package com.xworkz.database.service;

import com.xworkz.database.dto.HospitalDTO;

public interface HospitalService {
	
	boolean validateAndSave(HospitalDTO dto);

}
