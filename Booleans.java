package com.xworkz.master;

public class Booleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor
		Boolean bool=new Boolean("true");
		System.out.println(bool);
		
		Boolean lean=new Boolean(false);
		System.out.println(lean);
		
		//Instance method
		boolean value=lean.booleanValue();
		System.out.println(value);
		
		int com=lean.compareTo(false);
		System.out.println(com);
		
		int hash=lean.hashCode();
		System.out.println(hash);
		
		String tos=lean.toString();
		System.out.println(tos);
		
		//Static Method
		int camp=Boolean.compare(false, true);
		System.out.println(camp);
		
		boolean get=Boolean.getBoolean("true");
		System.out.println(get);
		
		int codes=Boolean.hashCode(false);
		System.out.println(codes);
		
		boolean parse=Boolean.parseBoolean("true");
		System.out.println(parse);
		
		String str=Boolean.toString(true);
		System.out.println(str);
		

	}

}
