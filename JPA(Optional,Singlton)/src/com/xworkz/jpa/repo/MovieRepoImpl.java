package com.xworkz.jpa.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.jpa.entity.MovieEntity;
import com.xworkz.jpa.util.JPAUtil;

public class MovieRepoImpl implements MovieRepo {

	private EntityManagerFactory factory = JPAUtil.getFactory();

	@Override
	public boolean save(MovieEntity entity) {

		// factory=Persistence.createEntityManagerFactory("xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		try {
			trans.begin();
			manager.persist(entity);
			trans.commit();
		} catch (PersistenceException e) {
			e.getStackTrace();
			trans.rollback();
		} finally {
			manager.close();
		}
		return false;
	}

	@Override
	public void save(List<MovieEntity> list) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			for (MovieEntity movieEntity : list) {
				manager.persist(movieEntity);
			}
			transaction.commit();
			
		} catch (PersistenceException per) {
			per.getStackTrace();
			transaction.rollback();

		} finally {
			manager.close();
		}

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
		try {
			trans.begin();
			MovieEntity ent = manage.find(MovieEntity.class, id);
			if (ent != null) {
				System.out.println("Entity found" + ent);
				ent.setName(name);
				manage.persist(ent);
				System.out.println("Name is updated");

			} else {
				System.err.println("not updated");
				trans.commit();
			}
		} catch (PersistenceException e) {
			e.getStackTrace();
			trans.rollback();
		}

		finally {
			manage.close();
		}

		// this.updateNameById(id, name);
	}

	@Override
	public void deleteById(int id) {

		EntityManager manag = factory.createEntityManager();
		EntityTransaction transaction = manag.getTransaction();
		try {
			transaction.begin();
			MovieEntity check = manag.find(MovieEntity.class, id);
			if (check != null) {
				manag.remove(check);
				transaction.commit();
				System.out.println("Deleted");

			} else {
				System.err.println("Not Deleted");
			}
		} catch (PersistenceException e) {
			e.getStackTrace();
			transaction.rollback();
		} finally {
			manag.close();
		}

		MovieRepo.super.deleteById(id);
	}

}
