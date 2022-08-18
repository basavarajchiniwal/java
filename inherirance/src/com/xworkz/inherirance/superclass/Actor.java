package com.xworkz.inherirance.superclass;

public class Actor {
	public String type;
	public double amount;
	public double height;
	public String language;
	public String name;
	
	public Actor()
	{
		System.out.println("Actor Constructor");
	}
	public void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.amount);
		System.out.println(this.height);
		System.out.println(this.language);
		System.out.println(this.name);
	}

}
