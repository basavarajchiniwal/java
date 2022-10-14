package com.xworkz.database.repository;

import com.xworkz.database.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("save"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Running repository");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the Driver
			//com.mysql.cj.jdbc.Driver-->this is FQN given by vendor
			//which is surrounded by try catch
			System.out.println("Sql running");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return true;
	}

}
