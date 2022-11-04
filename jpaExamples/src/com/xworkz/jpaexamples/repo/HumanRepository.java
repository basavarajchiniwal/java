package com.xworkz.jpaexamples.repo;

import com.xworkz.jpaexamples.entity.HumanEntity;

public interface HumanRepository {
	
	boolean save(HumanEntity entity);

}
