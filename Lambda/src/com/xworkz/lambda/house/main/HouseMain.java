package com.xworkz.lambda.house.main;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.lambda.house.OwningType;
import com.xworkz.lambda.house.Type;
import com.xworkz.lambda.house.dto.HouseDTO;

public class HouseMain {

	public static void main(String[] args) {
		
		HouseDTO house1=new HouseDTO(1, "Kulasruchi", "Kumar",Type.INDIVIDUAL, 1, false, OwningType.OWN, 12.2);
		HouseDTO house2=new HouseDTO(2, "Vibuthi", "Manoj",Type.INDIVIDUAL, 3, false, OwningType.OWN, 10.26);
		HouseDTO house3=new HouseDTO(3, "Forum", "Reddy",Type.VILLA, 8, true, OwningType.RENT, 500.26);
		HouseDTO house4=new HouseDTO(4, "Karma", "Kushal",Type.INDIVIDUAL, 4, true, OwningType.LEASE, 6.2);
		HouseDTO house5=new HouseDTO(5, "SriKrishna", "Krishna Reddy",Type.APARTMENT, 10, false, OwningType.RENT, 1000.25);
		HouseDTO house6=new HouseDTO(6, "Nanda Gokul", "Gokul",Type.APARTMENT, 12, false, OwningType.LEASE, 800.05);
		HouseDTO house7=new HouseDTO(7, "Gokul", "K Govind",Type.VILLA, 8, false, OwningType.LEASE, 1120.08);
		
		List<HouseDTO> house=new ArrayList<HouseDTO>();
		house.add(house1);
		house.add(house2);
		house.add(house3);
		house.add(house4);
		house.add(house5);
		house.add(house6);
		house.add(house7);
		
		house.forEach((ref)-> System.out.println("State Name :" + ref)); 
		house.stream().sorted((h1,h2)->{
			return Integer.compare(h1.getId(), h2.getId());
		}).forEach((h)->System.out.println(h));
		System.out.println("=========================");
		house.forEach((ref)-> System.out.println("State Name :" + ref)); 
		house.stream().sorted((h1,h2)->{
			return Integer.compare(h2.getId(), h1.getId());
		}).forEach((h)->System.out.println(h));
		System.out.println("=========================");
		
		house.stream().filter((ref)->ref.getLoan()==true).sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).forEach((h)->System.out.println(h));
		System.out.println("=========================");
		house.stream().filter((ref)->ref.getLoan()==false).sorted((h1,h2)->h2.getOwner().compareTo(h1.getOwner())).forEach((h)->System.out.println(h));
		System.out.println("=========================");
		house.stream().filter((ref)->ref.getOwningType()==OwningType.LEASE).forEach((h)->System.out.println(h));
		System.out.println("=========================");
		house.stream().filter((ref)->ref.getType()==Type.APARTMENT).forEach((h)->System.out.println(h));
		System.out.println("=========================");
		house.stream().filter((ref)->ref.getType()==Type.VILLA).forEach((h)->System.out.println(h));
		System.out.println("=========================");
	
		house.stream().sorted((h1,h2)->{
		int refs=h1.getType().compareTo(h2.getType());
		if(refs==0) {return h1.getOwningType().compareTo(h2.getOwningType());}
		return refs;
		}).forEach((ref)->System.out.println(ref));
		System.out.println("=========================");
		
		house.stream().sorted((h1,h2)->{
		Integer refs=h2.getName().compareTo(h1.getName());
		if(refs==0) {return Integer.compare(h2.getId(), h1.getId());}
		return refs;
		}).forEach((ref)->System.out.println(ref));
	
		}
}
