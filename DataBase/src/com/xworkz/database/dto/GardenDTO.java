package com.xworkz.database.dto;

public class GardenDTO {
	
	private String name;
	private String location;
	private String founder;
	private double area;
	
	public GardenDTO() {
		System.out.println("default Garden constructor");
	}

	public GardenDTO(String name, String location, String founder, double area) {
		super();
		this.name = name;
		this.location = location;
		this.founder = founder;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "GardenDTO [name=" + name + ", location=" + location + ", founder=" + founder + ", area=" + area + "]";
	}

}
