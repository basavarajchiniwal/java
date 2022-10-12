package com.xworkz.database.service;

import com.xworkz.database.dto.PropertyDTO;
import com.xworkz.database.repository.PropertyRepository;
import com.xworkz.database.repository.PropertyRepositoryImpl;

public class PropertyServiceImpl implements PropertyService {

	public PropertyServiceImpl() {
		System.out.println("check"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(PropertyDTO dto) {
		System.out.println("Running validation");
		int id=dto.getId();
		String owner=dto.getOwner();
		double price=dto.getPrice();
		double area=dto.getAreaInSquareMeter();
		String location=dto.getLocation();
		
		if(id>2 && id<1000)
		{
			System.out.println("id is valid");
			
			if(owner!=null && owner.length()>3 && owner.length()<50)
			{
				System.out.println("owner is valid");
				
				if(price>1 && price<10.50)
				{
					System.out.println("price is valid");
					
					if(area>10 && area<10000)
					{
						System.out.println("area is valid");
						
						if(location!=null && location.length()>2 && location.length()<40)
						{
							System.out.println("location is valid");
							
							System.out.println("All properties are valid");
							PropertyRepository property=new PropertyRepositoryImpl();
							property.save(dto);
						}
						else
						{
							System.err.println("location invalid");
						}
					}
					else
					{
						System.err.println("area invalid");
					}
				}
				else
				{
					System.err.println("price invalid");
				}
			}
			else
			{
				System.err.println("owner invalid");
			}
		}
		else
		{
			System.err.println("id invalid");
		}
		
		
		return false;
	}

}
     