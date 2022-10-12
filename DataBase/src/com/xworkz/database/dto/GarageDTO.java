package com.xworkz.database.dto;

public class GarageDTO {
	
	private int id;
	private String name;
	private String owner;
	private double areaInSquareMeter;
	
	public GarageDTO(int id, String name, String owner, double areaInSquareMeter) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.areaInSquareMeter = areaInSquareMeter;
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

	public double getAreaInSquareMeter() {
		return areaInSquareMeter;
	}

	public void setAreaInSquareMeter(double areaInSquareMeter) {
		this.areaInSquareMeter = areaInSquareMeter;
	}

	@Override
	public String toString() {
		return "GarageDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", areaInSquareMeter="
				+ areaInSquareMeter + "]";
	}

}
