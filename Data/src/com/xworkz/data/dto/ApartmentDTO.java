package com.xworkz.data.dto;

import java.io.Serializable;
import java.util.Arrays;

public class ApartmentDTO implements Serializable{

	private String apartmentName;
	private String ownerName;
	private String[] securityNames;
	private String area;
	private String belongCity;
	private String district;
	private String taluk;
	private String corporatorName;
	private String apartType;
	private String paymentType;
	private String landArea;
	private String paintColour;
	private String securityshift;
	private int noOfBlocks;
	private double totalArea;
	
	public ApartmentDTO() {
		System.out.println("default DTO constructor");
	}
	@Override
	public String toString() {
		return "ApartmentDTO [apartmentName=" + apartmentName + ", ownerName=" + ownerName + ", securityNames="
				+ Arrays.toString(securityNames) + ", area=" + area + ", belongCity=" + belongCity + ", district="
				+ district + ", taluk=" + taluk + ", corporatorName=" + corporatorName + ", apartType=" + apartType
				+ ", paymentType=" + paymentType + ", landArea=" + landArea + ", paintColour=" + paintColour
				+ ", securityshift=" + securityshift + ", noOfBlocks=" + noOfBlocks + ", totalArea=" + totalArea + "]";
	}
	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String[] getSecurityNames() {
		return securityNames;
	}

	public void setSecurityNames(String[] securityNames) {
		this.securityNames = securityNames;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBelongCity() {
		return belongCity;
	}

	public void setBelongCity(String belongCity) {
		this.belongCity = belongCity;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getCorporatorName() {
		return corporatorName;
	}

	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}

	public String getApartType() {
		return apartType;
	}

	public void setApartType(String apartType) {
		this.apartType = apartType;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getPaintColour() {
		return paintColour;
	}

	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}

	public String getSecurityshift() {
		return securityshift;
	}

	public void setSecurityshift(String securityshift) {
		this.securityshift = securityshift;
	}

	public int getNoOfBlocks() {
		return noOfBlocks;
	}

	public void setNoOfBlocks(int noOfBlocks) {
		this.noOfBlocks = noOfBlocks;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}
	
	
	
}
