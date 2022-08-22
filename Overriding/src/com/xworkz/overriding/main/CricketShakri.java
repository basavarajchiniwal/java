package com.xworkz.overriding.main;

import com.xworkz.overriding.subclass.OneDayCricket;
import com.xworkz.overriding.subclass.T20Cricket;
import com.xworkz.overriding.subclass.TestCricket;
import com.xworkz.overriding.superclass.Cricket;

public class CricketShakri {

	public static void main(String[] args) {
		Cricket cricket=new TestCricket();
		cricket.entertainment();
		cricket.presentation();
		cricket.setDetails("India","Kohli", 'M');
		cricket.printData();
			
		TestCricket test=new OneDayCricket();
		test.presentation();
		test.entertainment();
			
		OneDayCricket oneDay=new OneDayCricket();
		oneDay.manOfSeries("Rohith");
				
		T20Cricket tCrick=new T20Cricket();
		tCrick.manOfTheMatch();
		tCrick.entertainment();
				
	}
}
