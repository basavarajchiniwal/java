package com.xworkz.jpaexamples.service;

import com.xworkz.jpaexamples.entity.HumanEntity;
import com.xworkz.jpaexamples.repo.HumanRepository;

public class HumanServiceImpl implements HumanService {

	private HumanRepository repo;
	
	public HumanServiceImpl(HumanRepository repo) {
		this.repo=repo;
	}
	@Override
	public boolean validateAndSave(HumanEntity entity) {
		
		 int id=entity.getId();
		 String name=entity.getName();
		 String color=entity.getColor();
		 String gender=entity.getGender();
		 double weight=entity.getWeight();
		 double height=entity.getHeight();
		 String eyeColor=entity.getEyeColor();
		 String hairColor=entity.getHairColor();
		 int age=entity.getAge();
		 boolean marriageStatus=entity.isMarriageStatus();
		 double temperature=entity.getTemperature();
		 boolean alive=entity.isAlive();
		 String panNo=entity.getPanNo();
		 long aadharNo=entity.getAadharNo();
		 String voterId=entity.getVoterId();
		
		if(id>0) {
			System.out.println("id is valid");
		}
		else {
			return false;
		}
		if(name!=null && name.length()>3 && name.length()<50) {
			System.out.println("name is valid");
		}
		else {
			return false;
		}
		if(color!=null && color.length()>3 && color.length()<50) {
			System.out.println("color is valid");
		}
		else {
			return false;
		}
		if(gender!=null && gender.length()>3 && gender.length()<50) {
			System.out.println("gender is valid");
		}
		else {
			return false;
		}
		if(weight>0.0 && weight<250.00) {
			System.out.println("weight is valid");
		}
		else {
			return false;
		}
			if(height>0.0 && height<250.00) {
				System.out.println("height is valid");
			}
			else {
				return false;
			}
				if(eyeColor!=null && eyeColor.length()>3 && eyeColor.length()<50) {
					System.out.println("eyeColor is valid");
				}
				else {
					return false;
				}
				if(hairColor!=null && hairColor.length()>3 && hairColor.length()<50) {
					System.out.println("hairColor is valid");
				}
				else {
					return false;
				}
				if(age>0 ) {
					System.out.println("age is valid");
				}
				else {
					return false;
				}
				if(marriageStatus==true || marriageStatus==true ) {
					System.out.println("marriageStatus is valid");
				}
				else {
					return false;
				}
				if(temperature>0.0 && temperature<250.00) {
					System.out.println("temperature is valid");
				}
				else {
					return false;
				}
				if(alive==true || alive==false) {
					System.out.println("alive is valid");
				}
				else {
					return false;
				}
				if(panNo!=null && panNo.length()>3 && panNo.length()<50) {
					System.out.println("panNo is valid");
				}
				else {
					return false;
				}
				if(aadharNo>0) {
					System.out.println("aadharNo is valid");
				}
				else {
					return false;
				}
				if(voterId!=null && voterId.length()>3 && voterId.length()<50) {
					System.out.println("voterId is valid");
				}
				else {
					return false;
				}
				
				
		return repo.save(entity);
	
	}
	
	

}
