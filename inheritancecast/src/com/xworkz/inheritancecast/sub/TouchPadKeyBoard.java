package com.xworkz.inheritancecast.sub;

import com.xworkz.inheritancecast.superclass.KeyBoard;

public class TouchPadKeyBoard extends KeyBoard {
	
	public String typeUsing;
	public int noOfButtons;
	public double width;
	
	public TouchPadKeyBoard(double length,int noOfFnKey,int noOfSpeialKey)
	{
		super(length,noOfFnKey,noOfSpeialKey);
		
	}
	public TouchPadKeyBoard(String typeUsing,int noOfButtons,double width)
	{
		this.typeUsing=typeUsing;
		this.noOfButtons=noOfButtons;
		this.width=width;
	}
	
	public void torisu()
	{
		System.out.println(super.length);
		System.out.println(super.noOfFnKey);
		System.out.println(super.noOfSpeialKey);
		System.out.println(this.typeUsing);
		System.out.println(this.noOfButtons);
		System.out.println(this.width);
	}

}
