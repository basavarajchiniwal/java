package com.xworkz.encapsulation.main;

import com.xworkz.encapsulation.subclass.OmkarTrainer;

public class OmkarMain {

	public static void main(String[] args) {
		
		 OmkarTrainer om=new  OmkarTrainer("Omkar",10,"Software Developer");
		 String ref=om.getSpecialization(); 
		 System.out.println(ref);        //Explicit
		 System.out.println(om.getExperience());    //Implicit
		 System.out.println(om.getName());
		 System.out.println(om.setTraining());
		 System.out.println(om.setCoding());
		 System.out.println(om.setConductInterview());
		
		 OmkarTrainer train=new  OmkarTrainer("Harish",5,"Software Engineer");
		 String ref1=train.getSpecialization();
		 System.out.println(ref1);
		 System.out.println(train.getExperience()); 
		 System.out.println(train.getName());
		 System.out.println(train.setTraining());
		 System.out.println(train.setCoding());
		 System.out.println(train.setConductInterview());
		 

	}

}
