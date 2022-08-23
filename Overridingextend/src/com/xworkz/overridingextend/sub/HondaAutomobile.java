package com.xworkz.overridingextend.sub;

import com.xworkz.overridingextend.sup.Automobile;

public class HondaAutomobile extends Automobile{
	
	public double openTime;
	public double closeTime;
	
	@Override
	public void torisu()
	{
		System.out.println("HondaAutomobile torisu");
		super.torisu();
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}
}
