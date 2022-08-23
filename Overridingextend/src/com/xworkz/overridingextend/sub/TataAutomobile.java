package com.xworkz.overridingextend.sub;

import com.xworkz.overridingextend.sup.Automobile;

public class TataAutomobile extends Automobile{
	
	@Override
	public void torisu()
	{
		super.torisu();
		System.out.println("TataAutomobile torisu");
	}

}
