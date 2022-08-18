package com.xworkz.master;

public class Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor
		Character charact=new Character('S');
		System.out.println(charact);
		
		//Instance method
		char val=charact.charValue();
		System.out.println(val);
		
		int camp=charact.compareTo('M');
		System.out.println(camp);
		
		String toss=charact.toString();
		System.out.println(toss);
		
		int code=charact.hashCode();
		System.out.println(code);
		
		//Static Method
		int count=Character.charCount(89);
		System.out.println(count);
			
		byte gett=Character.getDirectionality('C');
		System.out.println(gett);
		
		int depo=Character.getType('X');
		System.out.println(depo);
		
		char upper=Character.toUpperCase('t');
		System.out.println(upper);
		
		char lower=Character.toLowerCase('P');
		System.out.println(lower);
		
	}

}
