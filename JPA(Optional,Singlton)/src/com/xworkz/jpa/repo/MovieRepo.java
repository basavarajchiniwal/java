package com.xworkz.jpa.repo;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.entity.MovieEntity;

public interface MovieRepo {
	
	boolean save(MovieEntity entity);
	
	void save(List<MovieEntity> list);
	
	Optional<MovieEntity> findById(int id);
	
	void updateNameById(int id,String name);
	
	default void deleteById(int id)
	{
		
	}

}
