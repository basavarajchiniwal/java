package com.xworkz.jpaexamples.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="human")
public class HumanEntity {
	
		@Id
		@Column(name="id")
		private int id;
		@Column(name="name")
		private String name;
		@Column(name="color")
		private String color;
		@Column(name="gender")
		private String gender;
		@Column(name="weight")
		private double weight;
		@Column(name="height")
		private double height;
		@Column(name="eyeColor")
		private String eyeColor;
		@Column(name="hairColor")
		private String hairColor;
		@Column(name="age")
		private int age;
		@Column(name="marriageStatus")
		private boolean marriageStatus;
		@Column(name="temperature")
		private double temperature;
		@Column(name="alive")
		private boolean alive;
		@Column(name="panNo")
		private String panNo;
		@Column(name="aadharNo")
		private long aadharNo;
		@Column(name="voterId")
		private String voterId;
		
		

	}


