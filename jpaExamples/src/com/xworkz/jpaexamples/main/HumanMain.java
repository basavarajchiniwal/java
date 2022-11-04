package com.xworkz.jpaexamples.main;

import com.xworkz.jpaexamples.entity.HumanEntity;
import com.xworkz.jpaexamples.repo.HumanRepository;
import com.xworkz.jpaexamples.repo.HumanRepositoryImpl;
import com.xworkz.jpaexamples.service.HumanService;
import com.xworkz.jpaexamples.service.HumanServiceImpl;

public class HumanMain {

	public static void main(String[] args) {
		
		HumanEntity entity=new HumanEntity(2, "Sooraj", "Fair", "Male", 65.45, 5.6, "black", "black", 32, true, 38.23, true, "A124587Vb", 12457891, "TH12477");
		
		HumanRepository repository=new HumanRepositoryImpl();
		
		HumanService service=new HumanServiceImpl(repository);
		service.validateAndSave(entity);
		
		System.out.println(entity);

	}

}
