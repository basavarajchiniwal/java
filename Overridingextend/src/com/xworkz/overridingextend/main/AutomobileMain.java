package com.xworkz.overridingextend.main;

import com.xworkz.overridingextend.sub.HondaAutomobile;
import com.xworkz.overridingextend.sub.TataAutomobile;
import com.xworkz.overridingextend.sup.Automobile;

public class AutomobileMain {

	public static void main(String[] args) {
		
		Automobile tata=new HondaAutomobile();
		double see=tata.sellAccessories("Brake");
		System.out.println(see);
		tata.setBrand("Honda");
		tata.setType("Two wheeler");
	
		HondaAutomobile honda=new HondaAutomobile();
		//honda.torisu();
		honda.closeTime=9.00;
		honda.openTime=7.30;
		honda.brand="Tata";
		honda.type="Four wheeler";
		honda.torisu();
		
		System.out.println("==========");
		
		Automobile auto=new Automobile();
		String autom=auto.brand="Honda";
		System.out.println(autom);
		String autos=auto.type="Four wheeler";
		System.out.println(autos);
		
				
		

	}

}
