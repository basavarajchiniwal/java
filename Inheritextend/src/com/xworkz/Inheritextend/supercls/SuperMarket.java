package com.xworkz.Inheritextend.supercls;

import com.xworkz.Inheritextend.market.Market;

public class SuperMarket extends Market {
	
	public double openTime;
	public double closeTime;
	public int noOfItem;
	
	public SuperMarket()
	{
		System.out.println("Super market constructor");
	}
	public SuperMarket(String name,int noOfShop,double area)
	{
		//super(name,noOfShop,area);
		this.name=name;
		this.noOfShop=noOfShop;
		this.area=area;
	}
	public SuperMarket(double openTime,double closeTime,int noOfItem)
	{
		this.openTime=openTime;
		this.closeTime=closeTime;
		this.noOfItem=noOfItem;
	}
	public void print()
	{
		System.out.println("this.name:" + name);
		System.out.println("this.noOfShop:" + noOfShop);
		System.out.println("this.area:" + area);
		System.out.println("this.openTime:" + openTime);
		System.out.println("this.closeTime:" + closeTime);
		System.out.println("this.noOfItem:" + noOfItem);
		System.out.println("Super market constructor");
	}

	
	

}
