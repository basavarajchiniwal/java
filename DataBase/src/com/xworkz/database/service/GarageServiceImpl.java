package com.xworkz.database.service;

import com.xworkz.database.dto.GarageDTO;
import com.xworkz.database.repository.GarageRepository;
import com.xworkz.database.repository.GarageRepositoryImpl;
import com.xworkz.database.repository.HospitalRepository;
import com.xworkz.database.repository.HospitalRepositoryImpl;

public class GarageServiceImpl implements GarageService {

	public GarageServiceImpl() {
		System.out.println("check" + this.getClass().getSimpleName());
	}
	@Override
	public boolean validateAndSave(GarageDTO dto) {
		System.out.println("Running validation");
		
		int id=dto.getId();
		String name=dto.getName();
		String owner=dto.getOwner();
		double areaInSquareMeter=dto.getAreaInSquareMeter();
		
		if(id>0 && id<20)
		{
			System.out.println("id is valid");
			
			if(name!=null && name.length()>3 && name.length()<35)
			{
				System.out.println("name is valid");
				
				if(owner!=null && owner.length()>3 && owner.length()<40)
				{
					System.out.println("owner is valid");
					
						if(areaInSquareMeter>10 && areaInSquareMeter<5000)
						{
							System.out.println("areaInSquareMeter is valid");
							
							System.out.println("All properties are valid");
							
							GarageRepository garage=new GarageRepositoryImpl();
							garage.save(dto);
						}
						else
						{
							System.err.println("areaInSquareMeter invalid");
						}
					
				}
				else
				{
					System.err.println("owner invalid");
				}
			}
			else
			{
				System.err.println("name invalid");
			}
		}
		else
		{
			System.err.println("id invalid");
		}
		return false;
	}

}
