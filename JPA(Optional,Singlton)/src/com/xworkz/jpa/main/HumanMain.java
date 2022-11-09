package com.xworkz.jpa.main;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repo.HumanRepo;
import com.xworkz.jpa.repo.HumanRepoImpl;
import com.xworkz.jpa.service.HumanService;
import com.xworkz.jpa.service.HumanServiceImpl;
import com.xworkz.jpa.util.JPAUtil;

public class HumanMain {

	public static void main(String[] args) {

		HumanEntity ent = new HumanEntity(1, "Sushma", 154.02);

		HumanRepo repository = new HumanRepoImpl();
//		repository.save(ent);
//		System.out.println(ent);

		HumanService service = new HumanServiceImpl(repository);
//		service.validate(ent);

		HumanService serv = new HumanServiceImpl(new HumanRepoImpl());

		try {
		Optional<HumanEntity> option = serv.findById(1);

		if (option.isPresent()) {
			HumanEntity entity = option.get();
			System.out.println(entity);
		} else {
			System.err.println("Optional is null");
		}
		
		serv.updateNameById("Divya", 1);
		
		serv.deleteById(1);
		}
		finally {
			JPAUtil.getFactory().close();
		}
		

	}

}
