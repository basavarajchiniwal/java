package com.xworkz.overriding.subclass;

public class OneDayCricket extends TestCricket{
	
	public String bestBowler;
	public String bestBatsMan;
	
	public String manOfSeries(String name)
	{
		System.out.println("One day cricket method");
		return "Rohith Sharma";
	}
	
	public double presentation()
	{
		System.out.println("One day cricket over-riding");
	return 0;
	}
	 public boolean entertainment()
	 {
		 System.out.println("One day over-riding");
		 return false;	 
	 }
}
