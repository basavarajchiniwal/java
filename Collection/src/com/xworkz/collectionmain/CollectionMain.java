package com.xworkz.collectionmain;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMain{

	public static <E> void main(String[] args) {
		
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Java");
		list.add("Html");
		list.add("Css");
		list.add("Java Script");
		System.out.println(list);

		/*System.out.println(list.lastIndexOf("Java"));		
		System.out.println(list.indexOf("Html"));		
		System.out.println(list.clone());
		System.out.println(list);	
		/*list.remove(1);		
		System.out.println(list.get(1));		
		list.clear();		
		//list.remove(1);		
		System.out.println(list);		
		//System.out.println(list.get(1));		
		boolean cont=list.contains("Css");
		System.out.println(cont);		
		boolean empt=list.isEmpty();
		System.out.println(empt);*/		
		LinkedList<Object> link=new LinkedList<Object>();
		link.add(1);
		link.add(2);
		link.add(4);
		link.add(3);
		link.add(4);
		System.out.println(link);
		
	}		
}
