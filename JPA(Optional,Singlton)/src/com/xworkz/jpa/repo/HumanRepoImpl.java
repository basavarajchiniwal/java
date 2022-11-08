package com.xworkz.jpa.repo;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.util.JPAUtil;

public class HumanRepoImpl implements HumanRepo {

	private EntityManagerFactory factory = JPAUtil.getFactory();

	@Override
	public boolean save(HumanEntity entity) {

		factory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		manager.persist(entity);
		trans.commit();
		manager.close();

		return false;
	}

	@Override
	public Optional<HumanEntity> findById(int id) {

		EntityManager manager = factory.createEntityManager();
		HumanEntity entity = manager.find(HumanEntity.class, id);
		if (entity != null) {
			System.out.println("Entity found for id" + entity);
			return Optional.of(entity);
		} else {
			System.err.println("Entity not found for id" + id);
		}

		return Optional.empty();
	}
	
	@Override
	public void updateNameById(String name, int id) {
		
		EntityManager manage=factory.createEntityManager();
		EntityTransaction trans=manage.getTransaction();
		trans.begin();
		HumanEntity humanEntity=manage.find(HumanEntity.class, id);
		if(humanEntity != null) {
			System.out.println("entity found" + humanEntity);
			humanEntity.setName(name);
			manage.persist(humanEntity);
			//manage.merge(humanEntity);  persist and merge both are same
			System.out.println("name is updated");
			
		}
		else {
			System.err.println("entity not found"+ id);
		}
		trans.commit();
		
		HumanRepo.super.updateNameById(name, id);
	}
	
	@Override
	public void deleteLengthById(double length, int id) {
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		HumanEntity entity=manager.find(HumanEntity.class, id);
		if(entity != null)
		{
			System.out.println("Entity is found"+ entity);
			manager.remove(entity);			
			manager.persist(entity);
			System.out.println("length is deleted"+id);
		}
		else {
			System.err.println("length is not deleted");
		}
		transaction.commit();
		
		HumanRepo.super.deleteLengthById(length, id);
	}

}













