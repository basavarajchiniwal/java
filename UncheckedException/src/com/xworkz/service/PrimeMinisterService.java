package com.xworkz.service;

import com.xworkz.exception.CheckedException;

public interface PrimeMinisterService {
	
	boolean validateAndSave(String name) throws CheckedException;

}
