package com.xworkz.supermarket.enumm;

public enum SuperMarketCredential {
	
	URL("jdbc:mySql://localhost:3306/xworkz"),USERNAME("root"),SECRET("Xworkzodc@123");
	
	private String value;
	private SuperMarketCredential(String value) {
		this.value=value;
	}
	
	public String getValue()
	{
		return value;
	}

}
