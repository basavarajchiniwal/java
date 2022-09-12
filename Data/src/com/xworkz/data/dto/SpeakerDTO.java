package com.xworkz.data.dto;

import java.io.Serializable;

public class SpeakerDTO implements Serializable{
	
	private String brandName;
	private String type;
	private Double size;
	private Double weight;
	private String color;
	private String soundsLevel;
	private Boolean useful;
	private String carryType;
	private Boolean chargeSystem;
	private Double price;
	private Integer noOfUsers;
	private String quality;
	private Integer watts;
	private String frequencyRange;
	private String volumeRange;
	
	public SpeakerDTO() {
		System.out.println("Default Constructor");
	}

	@Override
	public String toString() {
		return "SpeakerDTO [brandName=" + brandName + ", type=" + type + ", size=" + size + ", weight=" + weight
				+ ", color=" + color + ", soundsLevel=" + soundsLevel + ", useful=" + useful + ", carryType="
				+ carryType + ", chargeSystem=" + chargeSystem + ", price=" + price + ", noOfUsers=" + noOfUsers
				+ ", quality=" + quality + ", watts=" + watts + ", frequencyRange=" + frequencyRange + ", volumeRange="
				+ volumeRange + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
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

	public String getSoundsLevel() {
		return soundsLevel;
	}

	public void setSoundsLevel(String soundsLevel) {
		this.soundsLevel = soundsLevel;
	}

	public Boolean getUseful() {
		return useful;
	}

	public void setUseful(Boolean useful) {
		this.useful = useful;
	}

	public String getCarryType() {
		return carryType;
	}

	public void setCarryType(String carryType) {
		this.carryType = carryType;
	}

	public Boolean getChargeSystem() {
		return chargeSystem;
	}

	public void setChargeSystem(Boolean chargeSystem) {
		this.chargeSystem = chargeSystem;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNoOfUsers() {
		return noOfUsers;
	}

	public void setNoOfUsers(Integer noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Integer getWatts() {
		return watts;
	}

	public void setWatts(Integer watts) {
		this.watts = watts;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public String getVolumeRange() {
		return volumeRange;
	}

	public void setVolumeRange(String volumeRange) {
		this.volumeRange = volumeRange;
	}
	

}
