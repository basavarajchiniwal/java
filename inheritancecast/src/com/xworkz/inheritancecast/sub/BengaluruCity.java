package com.xworkz.inheritancecast.sub;

import com.xworkz.inheritancecast.superclass.City;

public class BengaluruCity extends City{
	
	public String capitalOf;
	public int noOfDist;
	public int noOfTaluk;
	
	public BengaluruCity(String name,Double populationInMil,double area)
	{
		super(name,populationInMil,area);
	}
	public BengaluruCity(String capitalOf,int noOfDist,int noOfTaluk)
	{
		this.capitalOf=capitalOf;
		this.noOfDist=noOfDist;
		this.noOfTaluk=noOfTaluk;
	}
	public void torisu()
	{
		System.out.println(super.name);
		System.out.println(super.populationInMil);
		System.out.println(super.area);
		System.out.println(this.capitalOf);
		System.out.println(this.noOfDist);
		System.out.println(this.noOfTaluk);
	}
	
}
