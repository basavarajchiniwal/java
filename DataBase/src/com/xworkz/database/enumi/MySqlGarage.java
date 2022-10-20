package com.xworkz.database.enumi;

public enum MySqlGarage {
	
	UPI("jdbc:mysql://localhost:3306/xworkz"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String value;
	
	private MySqlGarage(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
