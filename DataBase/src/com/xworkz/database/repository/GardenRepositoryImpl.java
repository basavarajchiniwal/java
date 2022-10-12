package com.xworkz.database.repository;

import com.xworkz.database.dto.GardenDTO;

public class GardenRepositoryImpl implements GardenRepository {

	public GardenRepositoryImpl() {
		System.out.println("save"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(GardenDTO dto) {
		System.out.println("running repository");
		return true;
	}
}
