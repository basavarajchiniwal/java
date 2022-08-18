package com.xworkz.master;

public class StaticInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=Integer.compare(20,20);
		System.out.println(value);
		
		int unSign=Integer.compareUnsigned(15, 16);
		System.out.println(unSign);
		
		int count=Integer.bitCount(29);
		System.out.println(count);
		
		int code=Integer.hashCode(100);
		System.out.println(code);
		
		Integer dcod=Integer.decode("250");
		System.out.println(dcod);
		

	}

}
