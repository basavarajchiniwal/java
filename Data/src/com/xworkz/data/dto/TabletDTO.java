package com.xworkz.data.dto;

import java.io.Serializable;

public class TabletDTO implements Serializable{
	
	private String name;
	private String useFor;
	private Double weight;
	private String color;
	private String shape;
	private Double cost;
	private String storedIn;
	private Boolean solubleInWater;
	private String otherName;
	private String drugClass;
	private Integer mg;
	private String manufacturer;
	private String madeIn;
	private String prescribedBy;
	private String composition;
	
	public TabletDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "TabletDTO [name=" + name + ", useFor=" + useFor + ", weight=" + weight + ", color=" + color + ", shape="
				+ shape + ", cost=" + cost + ", storedIn=" + storedIn + ", solubleInWater=" + solubleInWater
				+ ", otherName=" + otherName + ", drugClass=" + drugClass + ", mg=" + mg + ", manufacturer="
				+ manufacturer + ", madeIn=" + madeIn + ", prescribedBy=" + prescribedBy + ", composition="
				+ composition + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUseFor() {
		return useFor;
	}

	public void setUseFor(String useFor) {
		this.useFor = useFor;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getStoredIn() {
		return storedIn;
	}

	public void setStoredIn(String storedIn) {
		this.storedIn = storedIn;
	}

	public Boolean getSolubleInWater() {
		return solubleInWater;
	}

	public void setSolubleInWater(Boolean solubleInWater) {
		this.solubleInWater = solubleInWater;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getDrugClass() {
		return drugClass;
	}

	public void setDrugClass(String drugClass) {
		this.drugClass = drugClass;
	}

	public Integer getMg() {
		return mg;
	}

	public void setMg(Integer mg) {
		this.mg = mg;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public String getPrescribedBy() {
		return prescribedBy;
	}

	public void setPrescribedBy(String prescribedBy) {
		this.prescribedBy = prescribedBy;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}
	
	

}
