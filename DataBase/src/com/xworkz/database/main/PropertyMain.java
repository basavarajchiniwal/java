package com.xworkz.database.main;

import com.xworkz.database.dto.PropertyDTO;
import com.xworkz.database.service.PropertyService;
import com.xworkz.database.service.PropertyServiceImpl;

public class PropertyMain {

	public static void main(String[] args) {
		
		PropertyDTO propertyDTO=new PropertyDTO(120,"Gowdru",8.6,1100,"CPT");
		System.out.println(propertyDTO);
		
		PropertyService property=new PropertyServiceImpl();
		property.validateAndSave(propertyDTO);
		

	}

}
