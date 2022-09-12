package com.xworkz.data.dto;

import java.io.Serializable;

public class AlcoholDTO implements Serializable{
	private Double ph;
	private Double boilingPoint;
	private Double meltingPoint;
	private Double density;
	private String nature;
	private String taste;
	private String group;
	private Double molecularWeight;
	private Boolean solubleInWater;
	private Integer noOfCarbon;
	private boolean flamable;
	private String hazardous;
	private Double toxicRange;
	private Double vapourPressure;
	private String conjugateAcid;
	private String conjugatebase;
	
	public AlcoholDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public String toString() {
		return "AlcoholDTO [ph=" + ph + ", boilingPoint=" + boilingPoint + ", meltingPoint=" + meltingPoint
				+ ", density=" + density + ", nature=" + nature + ", taste=" + taste + ", group=" + group
				+ ", molecularWeight=" + molecularWeight + ", solubleInWater=" + solubleInWater + ", noOfCarbon="
				+ noOfCarbon + ", flamable=" + flamable + ", hazardous=" + hazardous + ", toxicRange=" + toxicRange
				+ ", vapourPressure=" + vapourPressure + ", conjugateAcid=" + conjugateAcid + ", conjugatebase="
				+ conjugatebase + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Double getPh() {
		return ph;
	}

	public void setPh(Double ph) {
		this.ph = ph;
	}

	public Double getBoilingPoint() {
		return boilingPoint;
	}

	public void setBoilingPoint(Double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public Double getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(Double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public Double getDensity() {
		return density;
	}

	public void setDensity(Double density) {
		this.density = density;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public Double getMolecularWeight() {
		return molecularWeight;
	}

	public void setMolecularWeight(Double molecularWeight) {
		this.molecularWeight = molecularWeight;
	}

	public Boolean getSolubleInWater() {
		return solubleInWater;
	}

	public void setSolubleInWater(Boolean solubleInWater) {
		this.solubleInWater = solubleInWater;
	}

	public Integer getNoOfCarbon() {
		return noOfCarbon;
	}

	public void setNoOfCarbon(Integer noOfCarbon) {
		this.noOfCarbon = noOfCarbon;
	}

	public boolean isFlamable() {
		return flamable;
	}

	public void setFlamable(boolean flamable) {
		this.flamable = flamable;
	}

	public String getHazardous() {
		return hazardous;
	}

	public void setHazardous(String hazardous) {
		this.hazardous = hazardous;
	}

	public Double getToxicRange() {
		return toxicRange;
	}

	public void setToxicRange(Double toxicRange) {
		this.toxicRange = toxicRange;
	}

	public Double getVapourPressure() {
		return vapourPressure;
	}

	public void setVapourPressure(Double vapourPressure) {
		this.vapourPressure = vapourPressure;
	}

	public String getConjugateAcid() {
		return conjugateAcid;
	}

	public void setConjugateAcid(String conjugateAcid) {
		this.conjugateAcid = conjugateAcid;
	}

	public String getConjugatebase() {
		return conjugatebase;
	}

	public void setConjugatebase(String conjugatebase) {
		this.conjugatebase = conjugatebase;
	}
	
	

}
