package com.xworkz.database.dto;

public class PropertyDTO {
	
	private int id;
	private String owner;
	private double price;
	private double areaInSquareMeter;
	private String location; 
	
	public PropertyDTO() {
		System.out.println("Property constructor");
	}

	public PropertyDTO(int id, String owner, double price, double areaInSquareMeter, String location) {
		super();
		this.id = id;
		this.owner = owner;
		this.price = price;
		this.areaInSquareMeter = areaInSquareMeter;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAreaInSquareMeter() {
		return areaInSquareMeter;
	}

	public void setAreaInSquareMeter(double areaInSquareMeter) {
		this.areaInSquareMeter = areaInSquareMeter;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "PropertyDTO [id=" + id + ", owner=" + owner + ", price=" + price + ", areaInSquareMeter="
				+ areaInSquareMeter + ", location=" + location + "]";
	}
	
	

}
