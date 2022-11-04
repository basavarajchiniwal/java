package com.xworkz.jpaexamples.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpaexamples.entity.HumanEntity;

public class HumanRepositoryImpl implements HumanRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("metro");

	@Override
	public boolean save(HumanEntity entity) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}

}
