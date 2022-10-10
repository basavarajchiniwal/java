package com.xworkz.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class StatesMain {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
	
		Collections.addAll(list,"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chattisgarh","Goa",
				"Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Mandhya Pradesh",
				"Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajastan",
				"Sikkim","Tamil Nadu","Telangana","Tripura","Uttarkhand","Uttar Pradesh","West Bengal");
		
		list.forEach((lis)-> System.out.println("State Name :" + lis));  //used to display all states
		System.out.println("====================");
		
		System.out.println("Display States endswith 'a' in below");
		list.stream().filter((lis)->lis.endsWith("a")).forEach(lis -> System.out.println(lis));
		System.out.println("====================");
		
		System.out.println("Display States Starts with 'K' in below");
		list.stream().filter((lis)-> lis.startsWith("K")).forEach(lis -> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().filter((lis)->lis.contains("L")).forEach(lis -> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().filter((lis)->lis.contains("D")).forEach(lis-> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().filter((lis)->lis.contains("R")).forEach(lis-> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().filter((lis)->lis.contains("h")).forEach(lis-> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().filter((lis)-> lis.length()>10).forEach(lis-> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().filter((lis)-> lis.length()<5).forEach(lis-> System.out.println(lis));
		System.out.println("====================");
		
		list.stream().forEach((lis)-> System.out.println(lis.toUpperCase()));
		System.out.println("====================");
		
		list.stream().forEach((lis)-> System.out.println(lis.toLowerCase()));
		System.out.println("====================");
		
		list.stream().forEach((lis)->System.out.println(new StringBuffer().append(lis).reverse()));
		System.out.println("====================");
		
		list.stream().forEach((lis)->System.out.println(lis));
		System.out.println("====================");
		long sts=list.stream().count();
		System.out.println("Total States : "+ sts);
	}
}
