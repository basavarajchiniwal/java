package com.xworkz.inherirance.superclass;

public class Cycle {
	public String inventor;
	public double cost;
	public int noOfSeat;
	public int noOfTyre;
	public boolean handle;
	
	public Cycle()
	{
		System.out.println("Cycle Constructor");
	}

	public void torisu()
	{
		System.out.println(this.inventor);
		System.out.println(this.cost);
		System.out.println(this.noOfSeat);
		System.out.println(this.noOfTyre);
		System.out.println(this.handle);
	}
}
