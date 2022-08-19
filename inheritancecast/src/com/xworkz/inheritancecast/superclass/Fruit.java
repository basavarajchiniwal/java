package com.xworkz.inheritancecast.superclass;

public class Fruit {
	
	public String name;
	public String shape;
	public String color;
	
	public Fruit()
	{
		System.out.println("Fruit constructor");
	}
	
	public Fruit(String name,String shape,String color)
	{
		this.name=name;
		this.shape=shape;
		this.color=color;
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.shape);
		System.out.println(this.color);
	}

}
