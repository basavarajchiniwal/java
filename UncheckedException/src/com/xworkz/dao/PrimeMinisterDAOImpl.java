package com.xworkz.dao;

import com.xworkz.exception.UnCheckedException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {

	private String[] dataStore=new String[5];
	private int index;
	
	
	@Override
	public boolean save(String name) throws UnCheckedException{
		if(this.index < this.dataStore.length)
		{  
			this.dataStore[index]=name;
		    System.out.println("dataStore:" + name + "index" + this.index);
		    this.index++;
		    return true;
		}
		else {
			System.err.println("index value is not valid");
			throw new UnCheckedException("not valid");
		}
	
	}

	@Override
	public boolean checkName(String name) {
		for(String ref :this.dataStore) 
			if(ref !=null && ref.equals(name))
			{
				System.out.println("Name is not null");
				return true;
			}
		
		return false;
	}

}
