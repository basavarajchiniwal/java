package com.xworkz.jpaexamples.main;

import com.xworkz.jpaexamples.entity.MetroEntity;
import com.xworkz.jpaexamples.repo.MetroRepository;
import com.xworkz.jpaexamples.repo.MetroRepositoryImpl;
import com.xworkz.jpaexamples.service.MetroService;
import com.xworkz.jpaexamples.service.MetroServiceImpl;

public class MetroMain {

	public static void main(String[] args) {
		
		MetroEntity metro=new MetroEntity(1,"Purple","Namma Metro",2000,40,"BMRCL",2,6,52,80,"bmrc.co.in");
		
		MetroRepository repository=new MetroRepositoryImpl();
		
		MetroService service=new MetroServiceImpl(repository);
		service.validateAndSave(metro);
		System.out.println(metro);
		
	}

}
