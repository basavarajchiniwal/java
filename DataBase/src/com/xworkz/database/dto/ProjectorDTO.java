package com.xworkz.database.dto;

public class ProjectorDTO {
	
	private String brand;
	private double size;
	private double price;
	private String color;
	private String shape;
	
	public ProjectorDTO() {
		System.out.println("Projector default");
	}

	public ProjectorDTO(String brand, double size, double price, String color, String shape) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
		this.shape = shape;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "ProjectorDTO [brand=" + brand + ", size=" + size + ", price=" + price + ", color=" + color + ", shape="
				+ shape + "]";
	}
	
}
