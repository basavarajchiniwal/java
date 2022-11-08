package com.xworkz.jpa.repo;

import java.util.Optional;

import com.xworkz.jpa.entity.MovieEntity;

public interface MovieRepo {
	
	boolean save(MovieEntity entity);
	
	Optional<MovieEntity> findById(int id);
	
	void updateNameById(int id,String name);
	
	default void deleteById(int id)
	{
		
	}

}
