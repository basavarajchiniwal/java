package com.xworkz.database.main;

import com.xworkz.database.dto.HospitalDTO;
import com.xworkz.database.service.HospitalService;
import com.xworkz.database.service.HospitalServiceImpl;

public class HospitalMain {

	public static void main(String[] args) {
	
		HospitalDTO hospitalDTO=new HospitalDTO(1,"G Madegowda","G Madegowda Super Speciality","Helath care",2019);
		System.out.println(hospitalDTO);
		
		HospitalService service=new HospitalServiceImpl();
		service.validateAndSave(hospitalDTO);

	}

}
