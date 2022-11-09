package com.xworkz.jpa.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.entity.MovieEntity;

public interface MovieService {

	boolean validateAndSave(MovieEntity entity);
	
	void save(List<MovieEntity> list);

	Optional<MovieEntity> findById(int id);

	default void updateNameById(int id, String name)
	{

	}

	default void deleteById(int id) {

	}

}
