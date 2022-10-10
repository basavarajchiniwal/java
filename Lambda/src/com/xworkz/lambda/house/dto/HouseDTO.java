package com.xworkz.lambda.house.dto;

import com.xworkz.lambda.house.OwningType;
import com.xworkz.lambda.house.Type;

public class HouseDTO {
	
	private int id;
	private String name;
	private String owner;
	private Type type;
	private int noOfFloors;
	private boolean loan;
	private OwningType owningType;
	private double squareFeet;
	

	public HouseDTO() {
	System.out.println("Default Constructor");
	}


	public HouseDTO(int id, String name, String owner, Type type, int noOfFloors, boolean loan, OwningType owningType,
			double squareFeet) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		this.owningType = owningType;
		this.squareFeet = squareFeet;
	}


	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", owningType=" + owningType + ", squareFeet=" + squareFeet + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public int getNoOfFloors() {
		return noOfFloors;
	}


	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}


	public boolean getLoan() {
		return loan;
	}


	public void setLoan(boolean loan) {
		this.loan = loan;
	}


	public OwningType getOwningType() {
		return owningType;
	}


	public void setOwningType(OwningType owningType) {
		this.owningType = owningType;
	}


	public double getSquareFeet() {
		return squareFeet;
	}


	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}

	
	
}
