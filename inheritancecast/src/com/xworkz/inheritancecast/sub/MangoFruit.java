package com.xworkz.inheritancecast.sub;

import com.xworkz.inheritancecast.superclass.Fruit;

public class MangoFruit extends Fruit{
	
	public String taste;
	public double price;
	public String grow;
	
	public MangoFruit(String name,String shape,String color)
	{
		super(name,shape,color);
	}
	
	public MangoFruit(String taste,double price,String grow)
	{
		this.taste=taste;
		this.price=price;
		this.grow=grow;
	}
	
	public void torisu()
	{
		System.out.println(super.name);
		System.out.println(super.shape);
		System.out.println(super.color);
		System.out.println(this.taste);
		System.out.println(this.price);
		System.out.println(this.grow);
		
	}
}
