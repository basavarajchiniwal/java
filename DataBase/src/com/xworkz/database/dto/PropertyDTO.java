package com.xworkz.database.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class PropertyDTO {
	
	private int id;
	private String owner;
	private double price;
	private double areaInSquareMeter;
	private String location; 
	
	
}
