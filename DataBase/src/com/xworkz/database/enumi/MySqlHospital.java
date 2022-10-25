package com.xworkz.database.enumi;

public enum MySqlHospital {
	
	URL("jdbc:mySql://localhost:3306/xworkz"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String value;
	private MySqlHospital(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
