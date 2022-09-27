package com.xworkz.detail.dto;

import java.io.Serializable;

public class DetailDTO implements Serializable{
	
	private String name;
	private String email;
	private long phoneNo;
	private long alterPhoneNo;
	private String gender;
	private String qualification;
	private int yearOfPassOut;
	private String university;
	private String address;
	private String skills;
	private double expectedSalary;
	private int experience;
	private String idProof;
	private double idProofNumber;

	public DetailDTO() {
		System.out.println("DTO default constructor");
	}

	@Override
	public String toString() {
		return "DetailDTO [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", alterPhoneNo="
				+ alterPhoneNo + ", gender=" + gender + ", qualification=" + qualification + ", yearOfPassOut="
				+ yearOfPassOut + ", university=" + university + ", address=" + address + ", skills=" + skills
				+ ", expectedSalary=" + expectedSalary + ", experience=" + experience + ", idProof=" + idProof
				+ ", idProofNumber=" + idProofNumber + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getAlterPhoneNo() {
		return alterPhoneNo;
	}

	public void setAlterPhoneNo(long alterPhoneNo) {
		this.alterPhoneNo = alterPhoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYearOfPassOut() {
		return yearOfPassOut;
	}

	public void setYearOfPassOut(int yearOfPassOut) {
		this.yearOfPassOut = yearOfPassOut;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public double getExpectedSalary() {
		return expectedSalary;
	}

	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public double getIdProofNumber() {
		return idProofNumber;
	}

	public void setIdProofNumber(double idProofNumber) {
		this.idProofNumber = idProofNumber;
	}
	
}
