package com.xworkz.inherirance;

import com.xworkz.inherirance.task.Helicopter;

public class HelicopterShakri {

	public static void main(String[] args) {
		
		Helicopter helicopter=new Helicopter();
		helicopter.speed=2500D;
		helicopter.weight=80000D;
		helicopter.noOfSeats=250;
		helicopter.fuelConsumption=2508D;
		helicopter.inventor="Alberto Santos-Dumont";
		helicopter.torisu();
	}
		
}
