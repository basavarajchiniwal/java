package com.xworkz.overridingextend.sup;

public class Automobile {
	public String type;
	public String brand;
	
	public double sellAccessories(String name)
	{
		System.out.println("Automobile sellAccessories");
		if("Brake"==name)
		{
			System.out.println("Brake cost is 6000");
			return 6000;
		}
		if("Wheel"==name)
		{
			System.out.println("Wheel cost is 8000");
			return 8000;
		}
		if("Clutch"==name)
		{
			System.out.println("Clutch cost is 5000");
			return 5000;
		}
		return 0;		
	}
	public void setType(String type)
	{
		System.out.println("Automobile type method");
		this.type=type;
	}
	public void setBrand(String brand)
	{
		System.out.println("Automobile brand method");
		this.brand=brand;
	}
	protected void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.brand);
	}
}
