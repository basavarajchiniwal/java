package com.xworkz.Inheritextend.subcls;

import com.xworkz.Inheritextend.supercls.SuperMarket;

public class OnlineSuperMarket extends SuperMarket{
	
	public boolean discount;
	public String nam;
	public double price;
	
	public OnlineSuperMarket()
	{
		System.out.println("Online Super Market default constructor");
	}
	public OnlineSuperMarket(double openTime,double closeTime,int noOfItem)
	{
		super(openTime,closeTime,noOfItem);

	}
	public OnlineSuperMarket(String name,int noOfShop,double area)
	{
		super(name,noOfShop,area);
	}
	public OnlineSuperMarket(boolean discount,String nam,double price)
	{
		this.discount=discount;
		this.nam=nam;
		this.price=price;
	}
	public void printData()
	{
		System.out.println("this.name:" + name);
		System.out.println("this.noOfShop:" + noOfShop);
		System.out.println("this.area:" + area);
		System.out.println("this.openTime:" + openTime);
		System.out.println("this.closeTime:" + closeTime);
		System.out.println("this.noOfItem:" + noOfItem);
		System.out.println("this.discount:"+ discount);
		System.out.println("this.nam:" + nam);
		System.out.println("this.price:" + price);
	}
}
