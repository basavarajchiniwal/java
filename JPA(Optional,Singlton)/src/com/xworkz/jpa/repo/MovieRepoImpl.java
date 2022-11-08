package com.xworkz.jpa.repo;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.jpa.entity.MovieEntity;
import com.xworkz.jpa.util.JPAUtil;

public class MovieRepoImpl implements MovieRepo {

	private EntityManagerFactory factory = JPAUtil.getFactory();

	@Override
	public boolean save(MovieEntity entity) {

		// factory=Persistence.createEntityManagerFactory("xworkz");
		EntityManager manager = factory.createEntityManager();
		try {
			EntityTransaction trans = manager.getTransaction();
			trans.begin();
			manager.persist(entity);
			trans.commit();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public Optional<MovieEntity> findById(int id) {

		EntityManager manager = factory.createEntityManager();
		MovieEntity movieEntity = manager.find(MovieEntity.class, id);
		if (movieEntity != null) {
			System.out.println("Entity valid" + movieEntity);
			Optional.of(movieEntity);
		} else {
			System.err.println("id invalid" + id);
		}
		manager.close();

		EntityManager manag = factory.createEntityManager();
		try {
			MovieEntity movie = manag.find(MovieEntity.class, id);
			if (movie != null) {
				System.out.println("id is not null" + movie);
				Optional.of(movie);
			} else {
				System.err.println("id is null" + id);
			}
		} finally {
			manag.close();
		}

		return Optional.empty();
	}

	@Override
	public void updateNameById(int id, String name) {

		EntityManager manage = factory.createEntityManager();
		EntityTransaction trans = manage.getTransaction();
		trans.begin();
		MovieEntity ent = manage.find(MovieEntity.class, id);
		if (ent != null) {
			System.out.println("Entity found" + ent);
			ent.setName(name);
			manage.persist(ent);
			System.out.println("Name is updated");

		} else {
			System.err.println("not updated");
		}
		trans.commit();
		manage.close();

		//this.updateNameById(id, name);
	}

	@Override
	public void deleteById(int id) {

		EntityManager manag = factory.createEntityManager();
		try {
			EntityTransaction transaction = manag.getTransaction();
			transaction.begin();
			MovieEntity check = manag.find(MovieEntity.class, id);
			if (check != null) {
				manag.remove(check);
				transaction.commit();
				System.out.println("Deleted");
			} else {
				System.err.println("Not Deleted");
			}
		} finally {
			manag.close();
		}

		MovieRepo.super.deleteById(id);
	}

}
