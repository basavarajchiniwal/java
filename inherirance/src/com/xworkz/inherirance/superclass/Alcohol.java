package com.xworkz.inherirance.superclass;

public class Alcohol {
	public String color;
	public double cost;
	public Double sugarContent;
	public double calories;
	public int freezingTemp;
	
	public Alcohol()
	{
		System.out.println("Alcohol constructor");
	}
	public void torisu()
	{
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.sugarContent);
		System.out.println(this.calories);
		System.out.println(this.freezingTemp);
	}
}
