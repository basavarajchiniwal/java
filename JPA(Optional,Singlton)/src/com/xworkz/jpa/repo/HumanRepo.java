package com.xworkz.jpa.repo;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;

public interface HumanRepo {
	
	boolean save(HumanEntity entity);
	

	Optional<HumanEntity> findById(int id);
	
	default void updateNameById(String name,int id)
	{
		this.findById(id);
	}

	default void deleteLengthById(double length,int id)
	{
		
	}
}
