package com.xworkz.jpaexamples.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpaexamples.entity.MetroEntity;

public class MetroRepositoryImpl implements MetroRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("metro");
	
	@Override
	public boolean save(MetroEntity entity) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		
		return true;
	}

}
