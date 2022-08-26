package com.xworkz.object.main;

import com.xworkz.object.sub.Fish;

public class FishMain {

	public static void main(String[] args) {
		
		Fish fish=new Fish("Fighter","Fresh water");
		//toString method
		String method=fish.toString();
		System.out.println(method);
		System.out.println(fish.getBreed());
		System.out.println(fish.getType());
		
		Fish fish1=new Fish("Shork","see water");
		System.out.println(fish1);
		System.out.println(fish1.getBreed());
		System.out.println(fish1.getType());
		
		fish=fish1;
		boolean compare=fish.equals(fish);
		System.out.println(compare);

		
	}

}
