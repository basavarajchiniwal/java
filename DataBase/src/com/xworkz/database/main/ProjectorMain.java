package com.xworkz.database.main;

import com.xworkz.database.dto.ProjectorDTO;
import com.xworkz.database.service.ProjectorService;
import com.xworkz.database.service.ProjectorServiceImpl;

public class ProjectorMain {

	public static void main(String[] args) {
		
		ProjectorDTO projectorDTO=new ProjectorDTO("Show",100.67,1500,"White","Rectangular");
		System.out.println(projectorDTO);
		
		ProjectorService projector=new ProjectorServiceImpl();
		projector.validateAndSave(projectorDTO);

	}

}
