package com.xworkz.master;

public class Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String name="143";
		Integer inte=new Integer(name);
		System.out.println(inte);
		
		int intes=25;
		Integer integer = new Integer(intes);
		System.out.println(integer);
		//Instance method--->
		byte value=integer.byteValue();
		System.out.println(value);
		
		int comp=integer.compareTo(25);
		System.out.println(comp);
		
		double val=integer.doubleValue();
		System.out.println(val);
		
		float flv=integer.floatValue();
		System.out.println(flv);
		
		int hash=integer.hashCode();
		System.out.println(hash);
		
		int invi=integer.intValue();
		System.out.println(invi);
		
		long longv=integer.longValue();
		System.out.println(longv);
		
		short shorvi=integer.shortValue();
		System.out.println(shorvi);
		
		String tos=integer.toString();
		System.out.println(tos);
		//Static Methods---->
		
		

		
	
		
		
			
			
	}

}
