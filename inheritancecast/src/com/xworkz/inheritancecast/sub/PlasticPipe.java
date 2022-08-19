package com.xworkz.inheritancecast.sub;

import com.xworkz.inheritancecast.superclass.Plastic;

public class PlasticPipe extends Plastic{
	public double dia;
	public double length;
	public String color;
	
	public PlasticPipe(double dia,double length,String color)
	{
		this.dia=dia;
		this.length=length;
		this.color=color;
	}
	public PlasticPipe(String material,double meltTempInF,double density)
	{
		super(material,meltTempInF,density);
	}
	public void torisu()
	{
		System.out.println(super.material);
		System.out.println(super.meltTempInF);
		System.out.println(super.density);
		System.out.println(this.dia);
		System.out.println(this.length);
		System.out.println(this.color);
	}
	

}
