package com.xworkz.inheritancecast.main;

import com.xworkz.inheritancecast.sub.EarthPlanet;
import com.xworkz.inheritancecast.superclass.Planet;

public class EarthShakri {

	public static void main(String[] args) {
		
		EarthPlanet earthPlanet=new EarthPlanet(6716,149.6,"5.972*10^24 kg");
		earthPlanet.torisu();
		
		Planet planet=new EarthPlanet(6616,150,"5.2*10^20 kg");
		EarthPlanet convert=(EarthPlanet)planet;
		convert.torisu();
		
		Planet planet1=new Planet("Earth",6371,true);
		planet1.torisu();
		

	}

}
