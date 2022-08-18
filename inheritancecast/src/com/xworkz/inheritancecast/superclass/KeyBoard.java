package com.xworkz.inheritancecast.superclass;

public class KeyBoard {
	
	public double length;
	public int noOfFnKey;
	public int noOfSpeialKey;
	
	public KeyBoard()
	{
		System.out.println("keyboard constructor");
	}
	
	public KeyBoard(double length,int noOfFnKey,int noOfSpeialKey)
	{
		this.length=length;
		this.noOfFnKey=noOfFnKey;
		this.noOfSpeialKey=noOfSpeialKey;
	}
	public void torisu()
	{
		System.out.println(this.length);
		System.out.println(this.noOfFnKey);
		System.out.println(this.noOfSpeialKey);
	}
	
	

}
