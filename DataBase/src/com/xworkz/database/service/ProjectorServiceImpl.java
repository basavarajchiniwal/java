package com.xworkz.database.service;

import com.xworkz.database.dto.ProjectorDTO;
import com.xworkz.database.repository.ProjectorRepository;
import com.xworkz.database.repository.ProjectorRepositoryImpl;

public class ProjectorServiceImpl implements ProjectorService {

	public ProjectorServiceImpl() {
		System.out.println("check" + this.getClass().getSimpleName());
	}
	@Override
	public boolean validateAndSave(ProjectorDTO dto) {
		System.out.println("Running valid");
		String brand=dto.getBrand();
		double size=dto.getSize();
		double price=dto.getPrice();
		String color=dto.getColor();
		String shape=dto.getShape();
		
		if(brand!=null && brand.length()>2 && brand.length()<25)
		{
			System.out.println("Brand is valid");
			
			if(size>2 && size<2000)
			{
				System.out.println("size is valid");
				
				if(price>1000 && price<10000)
				{
					System.out.println("price is valid");
					
					if(color!=null && color.length()>2 && color.length()<20)
					{
						System.out.println("color is valid");
						
						if(shape!=null && shape.length()>2 && shape.length()<36)
						{
							System.out.println("shape is valid");
							
							System.out.println("All properties are valid");
							ProjectorRepository projector=new ProjectorRepositoryImpl();
							projector.save(dto);
							
						}
						else
						{
							System.err.println("shape invalid");
						}
					}
					else
					{
						System.err.println("color invalid");
					}
				}
				else
				{
					System.err.println("price invalid");
				}
			}
			else
			{
				System.err.println("size invalid");
			}
		}
		else
		{
			System.err.println("brand invalid");
		}
		
		
		return false;
	}

}
