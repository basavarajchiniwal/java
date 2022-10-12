package com.xworkz.database.main;

import com.xworkz.database.dto.GardenDTO;
import com.xworkz.database.service.GardenService;
import com.xworkz.database.service.GardenServiceImpl;

public class GardenMain {

	public static void main(String[] args) {
		
		GardenDTO gardenDTO=new GardenDTO("Brundavan","Banglore","B R Reddy",1234);
		System.out.println(gardenDTO);
		
		GardenService gardenService=new GardenServiceImpl();
		gardenService.validateAndSave(gardenDTO);
	}

}
