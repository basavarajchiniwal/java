package com.xworkz.database.main;

import com.xworkz.database.dto.GarageDTO;
import com.xworkz.database.service.GarageService;
import com.xworkz.database.service.GarageServiceImpl;

public class GarageMain {

	public static void main(String[] args) {
		
		
		GarageDTO garageDTO=new GarageDTO(2,"Spare","Swaraj",1100);
		System.out.println(garageDTO);
		
		GarageService garage=new GarageServiceImpl();
		garage.validateAndSave(garageDTO);

	}

}
