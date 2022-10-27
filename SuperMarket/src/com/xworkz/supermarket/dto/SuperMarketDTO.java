package com.xworkz.supermarket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class SuperMarketDTO {
	
	
	private int id;
	private String name;
	private String company;
	private String gstNo;
	private int pincode;
	private String type;
	

}
