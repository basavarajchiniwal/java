package com.xworkz.database.service;

import com.xworkz.database.dto.HospitalDTO;
import com.xworkz.database.repository.HospitalRepository;
import com.xworkz.database.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {

	public HospitalServiceImpl() {
		System.out.println("check"+ this.getClass().getSimpleName());
	}
	@Override
	public boolean validateAndSave(HospitalDTO dto) {
		System.out.println("Running validation");
		int id=dto.getId();
		String founder=dto.getFounder();
		String name=dto.getName();
		String specialist=dto.getSpecialist();
		int since=dto.getSince();
		
		if(id>0 && id<30)
		{
			System.out.println("id is valid");
			
			if(founder!=null && founder.length()>3 && founder.length()<35)
			{
				System.out.println("founder is valid");
				
				if(name!=null && name.length()>1 && name.length()<100)
				{
					System.out.println("name is valid");
					
					if(specialist!=null && specialist.length()>4 && specialist.length()<50)
					{
						System.out.println("specialist is valid");
						
						if(since>1900 && since<2023)
						{
							System.out.println("since is valid");
							
							System.out.println("All properties are valid");
							
							HospitalRepository hospital=new HospitalRepositoryImpl();
							hospital.save(dto);
						}
						else
						{
							System.err.println("since invalid");
						}
					}
					else
					{
						System.err.println("specialist invalid");
					}
				}
				else
				{
					System.err.println("name invalid");
				}
			}
			else
			{
				System.err.println("founder invalid");
			}
		}
		else
		{
			System.err.println("id invalid");
		}
		return false;
	}

}
