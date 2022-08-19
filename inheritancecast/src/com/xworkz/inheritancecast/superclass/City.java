package com.xworkz.inheritancecast.superclass;

public class City {
	
	public String name;
	public Double populationInMil;
	public double area;
	
	public City()
	{
		System.out.println("City Constructor");
	}
	public City(String name,Double populationInMil,double area)
	{
		this.name=name;
		this.populationInMil=populationInMil;
		this.area=area;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.populationInMil);
		System.out.println(this.area);
	}

}
