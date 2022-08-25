package com.xworkz.encapsulation.sup;

public class Trainer {
	
	protected String name;
	protected int experience;
	protected String specialization;
	
	protected Trainer()
	{
		System.out.println("Trainer default constructor");
	}
	
	protected Trainer(String name,int experience,String specialization)
	{
		this.name=name;
		this.experience=experience;
		this.specialization=specialization;
	}
	//Setter Method
	protected  boolean setTraining()
	{
		System.out.println("Trainer training");
		return true;
	}
	protected boolean setConductInterview()
	{
		System.out.println("Conduct interviews");
		return true;
	}
	protected String setCoding()
	{
		System.out.println("Trainer coding");
		return "Java";
	}

}
