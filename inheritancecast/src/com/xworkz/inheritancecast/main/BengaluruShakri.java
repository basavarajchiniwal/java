package com.xworkz.inheritancecast.main;

import com.xworkz.inheritancecast.sub.BengaluruCity;
import com.xworkz.inheritancecast.superclass.City;

public class BengaluruShakri {

	public static void main(String[] args) {
		
		BengaluruCity bengaluruCity=new BengaluruCity("Karnataka",100,90);
		bengaluruCity.torisu();
		
		City city=new BengaluruCity("Karnataka1",110,90);
		city.torisu();
		
		BengaluruCity compare=(BengaluruCity)city;
		compare.torisu();
		
		City city1=new City("Bengaluru",1.2,25);
		city1.torisu();
		

	}

}
