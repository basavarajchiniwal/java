package com.xworkz.database.repository;

import com.xworkz.database.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("save"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Running repository");
		return true;
	}

}
