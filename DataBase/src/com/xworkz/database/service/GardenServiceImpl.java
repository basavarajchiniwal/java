package com.xworkz.database.service;

import com.xworkz.database.dto.GardenDTO;
import com.xworkz.database.repository.GardenRepository;
import com.xworkz.database.repository.GardenRepositoryImpl;

public class GardenServiceImpl implements GardenService {
	
	public GardenServiceImpl() {
		System.out.println("create "+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(GardenDTO dto) {
		System.out.println("Valid and save garden is running");
		String name=dto.getName();
		String founder=dto.getFounder();
		String location=dto.getLocation();
		double area=dto.getArea();
		
		if(name!=null && name.length()>3 && name.length()<30)
		{
			System.out.println("name is valid");
			if(founder!=null && founder.length()>3 && founder.length()<35)
			{
				System.out.println("founder is valid");
				if(location!=null && location.length()>4 && location.length()<50)
				{
					System.out.println("location is valid");
					if(area>20 && area<3000)
					{
						System.out.println("area is valid");
						
						System.out.println("all the properties are valid");
						GardenRepository garden=new GardenRepositoryImpl();
						garden.save(dto);
					}
					else
					{
						System.err.println("area invalid");
					}
				}
				else {
					System.err.println("location invalid");
				}
			}
			else {
				System.err.println("founder is invalid");
			}
		}
		else
		{
			System.err.println("name is invalid");
		}	
		return false;
	}

}
