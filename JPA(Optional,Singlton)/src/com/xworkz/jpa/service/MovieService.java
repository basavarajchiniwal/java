package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.MovieEntity;

public interface MovieService {

	boolean validateAndSave(MovieEntity entity);

	Optional<MovieEntity> findById(int id);

	default void updateNameById(int id, String name)
	{

	}

	default void deleteById(int id) {

	}

}
