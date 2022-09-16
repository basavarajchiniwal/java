package com.xworkz.dao;

import com.xworkz.exception.UnCheckedException;

public interface PrimeMinisterDAO {
	
	boolean save(String name) throws UnCheckedException;
	boolean checkName(String name);

}
