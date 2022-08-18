package com.xworkz.inherirance.superclass;

public class Train {
	
	public String name;
	public String stationName;
	public int noOfPlatform;
	public int noOfStops;
	public boolean reservs;
	
	
	public void getName(String stationName)
	{
		this.stationName=stationName;
	}
	
	public void torisu()
	{
		System.out.println(this.name);
		System.out.println(this.stationName);
		System.out.println(this.noOfPlatform);
		System.out.println(this.noOfStops);
		System.out.println(this.reservs);
	}

}
