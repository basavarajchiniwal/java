package com.xworkz.inherirance.superclass;

public class Browser {
	
	public String webSite;
	public double storage;
	public String searchWay;
	public boolean safeSearch;
	public String owner;
	
	public Browser()
	{
		System.out.println("Browser Constructor");
		
	}
	public void torisu()
	{
		System.out.println(this.webSite);
		System.out.println(this.storage);
		System.out.println(this.searchWay);
		System.out.println(this.safeSearch);
		System.out.println(this.owner);
	}
	

}
