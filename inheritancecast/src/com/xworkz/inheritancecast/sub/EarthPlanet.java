package com.xworkz.inheritancecast.sub;

import com.xworkz.inheritancecast.superclass.Planet;

public class EarthPlanet extends Planet {
	
	public double populationInMillion;
	public double distFromSunInMillion;
	public String mass;
	
	public EarthPlanet(String name,double radius,boolean habitant)
	{
		super(name,radius,habitant);
		
	}
	public EarthPlanet(double populationInMillion,double distFromSunInMillion,String mass)
	{
		this.populationInMillion=populationInMillion;
		this.distFromSunInMillion=distFromSunInMillion;
		this.mass=mass;
	}
	public void torisu()
	{
		System.out.println(super.name);
		System.out.println(super.radius);
		System.out.println(super.habitant);
		System.out.println(this.populationInMillion);
		System.out.println(this.distFromSunInMillion);
		System.out.println(this.mass);
		
	}

}
