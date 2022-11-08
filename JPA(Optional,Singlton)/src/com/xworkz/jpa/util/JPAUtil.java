package com.xworkz.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		System.out.println("Creating static block of util class");
		factory=Persistence.createEntityManagerFactory("xworkz");
	}
	
}
