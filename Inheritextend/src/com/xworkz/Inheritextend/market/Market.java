package com.xworkz.Inheritextend.market;

public class Market {
	
	public String name;
	public int noOfShop;
	public double area;
	
	public Market()
	{
		System.out.println("Market default constructor");
	}
	public void torisu()
	{
		System.out.println("this.name:" + name);
		System.out.println(this.noOfShop);
		System.out.println(this.area);
		
	}

}
