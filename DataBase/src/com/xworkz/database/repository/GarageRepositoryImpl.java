package com.xworkz.database.repository;

import com.xworkz.database.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {
	
	public GarageRepositoryImpl() {
		System.out.println("save"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("running repository");
		return true;
	}

}
