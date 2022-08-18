package com.xworkz.inheritancecast.superclass;

public class Planet {
	
	public String name;
	public double radius;
	public boolean habitant;
	
	public Planet()
	{
		System.out.println("Planet Constructor");
	}
	public Planet(String name,double radius,boolean habitant)
	{
		this.name=name;
		this.radius=radius;
		this.habitant=habitant;
	}
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.radius);
		System.out.println(this.habitant);
	}
	

}
