package com.xworkz.overriding.superclass;

public class Cricket {
	
	 public String country;
	 public String captain;
	 public char gender;
	 
	 public Cricket()
	 {
		 System.out.println("Cricket default constructor");
	 }
	 
	 public boolean entertainment()
	 {
		 System.out.println("Cricket entertainment");
		 return true;	 
	 }
	public double presentation()
	{
		System.out.println("Cricket presentation");
		return 0;
	}
	public void setDetails(String country,String captain,char gender)
	{
		this.country=country;
		this.captain=captain;
		this.gender=gender;
	}
	public void printData()
	{
		System.out.println("this.country:"+ country);
		System.out.println("captain="+ this.captain);
		System.out.println("gender="+ this.gender);
	}	
}
