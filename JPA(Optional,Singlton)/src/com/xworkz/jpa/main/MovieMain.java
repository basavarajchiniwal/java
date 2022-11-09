package com.xworkz.jpa.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.entity.MovieEntity;
import com.xworkz.jpa.service.MovieService;
import com.xworkz.jpa.service.MovieServiceImpl;
import com.xworkz.jpa.util.JPAUtil;

public class MovieMain {

	public static void main(String[] args) {

		MovieEntity entity = new MovieEntity(1, "Thiru", "Dhanush", "Nithya Menen", "Vikram Krishna");
		MovieEntity entity1 = new MovieEntity(2, "KGF-2", "Yash", "Srinidhi Shetty", "Vijay Kirgandur");
		MovieEntity entity2 = new MovieEntity(3, "Ugramm", "Sri Murali", "Haripriya", "Pradeep Neel");
		MovieEntity entity3 = new MovieEntity(6, "Mocktail", "Rishab Shetty", "Sapthami Gowda", "Vijay Kirgandur");
		
		List<MovieEntity> list= new ArrayList<MovieEntity>();
		list.add(entity);
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		

		MovieService service = new MovieServiceImpl();
		try {
			// service.validateAndSave(entity);
			// service.validateAndSave(entity1);
			// service.validateAndSave(entity2);
			// service.validateAndSave(entity3);
			// System.out.println(entity);

			Optional<MovieEntity> option = service.findById(4);
			if (option.isPresent()) {
				MovieEntity movieEntity = option.get();
				System.out.println(movieEntity);
			}

			service.updateNameById(2, "KGF-1");

			service.deleteById(2);
			service.deleteById(3);

		} finally {
			JPAUtil.getFactory().close();
		}

	}

}
