package com.xworkz.main;

import com.xworkz.dao.PrimeMinisterDAO;
import com.xworkz.dao.PrimeMinisterDAOImpl;
import com.xworkz.exception.CheckedException;
import com.xworkz.exception.UnCheckedException;
import com.xworkz.service.PrimeMinisterService;
import com.xworkz.service.PrimeMinisterServiceImpl;

public class PrimeMinisterMain {

	public static void main(String[] args) {
	
		PrimeMinisterDAO dao=new PrimeMinisterDAOImpl();
		
		PrimeMinisterService service=new PrimeMinisterServiceImpl(dao);
		try
		{
			service.validateAndSave("Narendra Modi");
			service.validateAndSave("Vajpayee");
			service.validateAndSave("H D Devegowda");
			service.validateAndSave("Narasimha");
			service.validateAndSave("Chandra Shekar");
			service.validateAndSave("V P Singh");
		}
		catch(CheckedException check)
		{
			System.out.println(check.getMessage());
		}
		catch(UnCheckedException unc)
		{
			System.out.println(unc.getMessage());
		}

	}

}
