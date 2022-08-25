package com.xworkz.encapsulation.subclass;

import com.xworkz.encapsulation.sup.Trainer;

public class OmkarTrainer extends Trainer{
	
	
	public OmkarTrainer()
	{
		System.out.println("Superclass constructor");
	}
	public OmkarTrainer(String name,int experience,String specialization)
	{
		super.name=name;
		super.experience=experience;
		super.specialization=specialization;
	}
	
	@Override
	public String setCoding() {
		return super.setCoding();
	}
	@Override
	public boolean setConductInterview() {
		return super.setConductInterview();
	}
	@Override
	public boolean setTraining() {
		return super.setTraining();
	}
	
	//Getter method
	//Encapsulation
	public String getName()
	{
		super.name=name;
		return name;
	}
	public int getExperience()
	{
		super.experience=experience;
		return experience;
	}
	public String getSpecialization()
	{
		super.specialization=specialization;
		return specialization;
	}

}
