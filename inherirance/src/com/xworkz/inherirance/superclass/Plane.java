package com.xworkz.inherirance.superclass;

public class Plane {

	public double speed;
	public double weight;
	public String inventor;
	public int noOfSeats;
	public double fuelConsumption;
	
	public Plane()
	{
		System.out.println("Plane Constructor");
	}
	public void torisu()
	{
		System.out.println(this.speed);
		System.out.println(this.weight);
		System.out.println(this.inventor);
		System.out.println(this.noOfSeats);
		System.out.println(this.fuelConsumption);
	}
}
