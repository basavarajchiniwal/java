package com.xworkz.person.enums;

public enum MySqlPersonCredential {
	
	URL("jdbc:mySql://localhost:3306/xworkz"),USERNAME("root"),SECRET("Xworkzodc@123"),JDBCDRIVER("com.mysql.cj.jdbc.Driver");
	
	private String value;
	private MySqlPersonCredential(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
