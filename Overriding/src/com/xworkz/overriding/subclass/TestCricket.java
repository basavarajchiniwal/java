package com.xworkz.overriding.subclass;

import com.xworkz.overriding.superclass.Cricket;

public class TestCricket extends Cricket{
	
	public String groundType;
	 
	@Override      //Attributes
	public double presentation()
	{
		System.out.println("Test Cricket presentation");	
		return 0;
	}
}
