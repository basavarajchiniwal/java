package com.xworkz.service;

import com.xworkz.dao.PrimeMinisterDAO;
import com.xworkz.exception.CheckedException;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	
	private PrimeMinisterDAO primeMinisterDAO;
	public PrimeMinisterServiceImpl(PrimeMinisterDAO primeMinisterDAO) {
		this.primeMinisterDAO=primeMinisterDAO;	
	}

	@Override
	public boolean validateAndSave(String name) throws CheckedException {
		if(name !=null && name.length()>4 && name.length()<50)
		{
			if(this.primeMinisterDAO.checkName(name))
			{
			System.out.println("Name is not duplicate");
			return primeMinisterDAO.save(name);
			}
			else {
				System.err.println("name is duplicate");
				throw new CheckedException("duplicate");				
			}
		}else {
			System.err.println("valid name");
			throw new CheckedException("Not valid");
		}
	}
	

}
