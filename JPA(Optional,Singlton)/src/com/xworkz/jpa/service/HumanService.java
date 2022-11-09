package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;

public interface HumanService {
	
	boolean validate(HumanEntity entity);
	
	Optional<HumanEntity> findById(int id);
	
	default void updateNameById(String name,int id)
	{
		this.findById(id);
	}
	
	default void deleteById(int id)
	{
		
	}

}
