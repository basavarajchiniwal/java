package com.xworkz.person.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class PersonDTO {
	
	int id;
	String name;
	String email;
	long mobileNumber;
	String gender;
	String qualification;
	Boolean married;
	Boolean working;
	String companyName;
	double salary;
	int age;
	int experience;
	String location;
	String city;
	String state;
	String country;
	long aadharNo;
	String panNo;
	Boolean alive;
	long bankAccountNo;
	
	
	
}
