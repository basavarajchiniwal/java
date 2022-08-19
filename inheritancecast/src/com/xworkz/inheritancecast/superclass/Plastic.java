package com.xworkz.inheritancecast.superclass;

public class Plastic {
	public String material;
	public double meltTempInF;
	public double density;
	
	public Plastic()
	{
		System.out.println("Plastic constructor");
	}
	public Plastic(String material,double meltTempInF,double density)
	{
		this.material=material;
		this.meltTempInF=meltTempInF;
		this.density=density;
	}
	public void torisu()
	{
		System.out.println(this.material);
		System.out.println(this.meltTempInF);
		System.out.println(this.density);
	}
}
