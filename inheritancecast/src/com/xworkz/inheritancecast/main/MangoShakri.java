package com.xworkz.inheritancecast.main;

import com.xworkz.inheritancecast.sub.MangoFruit;
import com.xworkz.inheritancecast.superclass.Fruit;

public class MangoShakri {

	public static void main(String[] args) {
		
		MangoFruit mangoFruit=new MangoFruit("Sweet",100,"Tree");
		mangoFruit.torisu();
		
		Fruit fruit=new MangoFruit("Sweet1",200,"Tree1");
		MangoFruit convert=(MangoFruit)fruit;
		convert.torisu();
		
		Fruit fruit1=new Fruit("Mango","Ovel","Green");
		fruit1.torisu();
	
	}
}
