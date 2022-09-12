package com.xworkz.data.dao;

import com.xworkz.data.dto.ApartmentDTO;

public class ApartmentDAOImpl implements ApartmentDAO {

	private ApartmentDTO[] apartments=new ApartmentDTO[14];
	private int index=0;
	@Override
	public boolean create(ApartmentDTO dto) {
		this.apartments[index]=dto;
		System.out.println("Apartment is,"+dto+"into index"+this.index);
		this.index++;
		return true;
	}

}
