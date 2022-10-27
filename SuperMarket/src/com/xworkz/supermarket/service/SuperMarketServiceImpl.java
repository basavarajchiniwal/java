package com.xworkz.supermarket.service;

import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;
import com.xworkz.supermarket.repository.SuperMarketRepository;
import com.xworkz.supermarket.repository.SuperMarketRepositoryImpl;

public class SuperMarketServiceImpl  implements SuperMarketService{
	

	public SuperMarketServiceImpl() {
		System.out.println("CheckOut" + this.getClass().getSimpleName());	
	}

	@Override
	public boolean validateAndSave(SuperMarketDTO dto) {
		System.out.println("Validation is running");
		
		int id=dto.getId();
		String name=dto.getName();
		String company=dto.getCompany();
		String gstNo=dto.getGstNo();
		int pincode=dto.getPincode();
		String type=dto.getType();
		
		if(id>0 && id<50)
		{
			System.out.println("Id is valid");
			if(name != null && name.length()>2 && name.length()<35)
			{
				System.out.println("Name is valid");
				if(company != null && company.length()>0 && company.length()<45)
				{
					System.out.println("Company is valid");
					if(gstNo!= null && gstNo.length()>0 && gstNo.length()<100)
					{
						System.out.println("GstNo is valid");
						if(pincode>100000 && pincode<1000000)
						{
							System.out.println("Pincode is valid");
							if(type != null && type.length()>0 && type.length()<80)
							{
								System.out.println("Type is valid");
								
								System.out.println("All properties are valid");
								SuperMarketRepository rep=new SuperMarketRepositoryImpl();
								rep.save(dto);
							}
							else {
								System.err.println("Type is invalid");
							}
						}
						else {
							System.err.println("pincode is invalid");
						}
							
					}
					else {
						System.err.println("GstNo is invalid");
					}
				}
				else {
					System.err.println("Company is invalid");
				}
			}
			else {
				System.err.println("Name is invalid");
			}			
		}
		else {
			System.err.println("Id is invalid");
		}
		return false;
	}

	@Override
	public void displayByName(String name) {
		SuperMarketRepository rep=new SuperMarketRepositoryImpl();
		rep.displayByName(name);
	}

	@Override
	public void validateAndSave(List<SuperMarketDTO> dto) {
		SuperMarketRepository rep=new SuperMarketRepositoryImpl();
		
	}
	
	

}
