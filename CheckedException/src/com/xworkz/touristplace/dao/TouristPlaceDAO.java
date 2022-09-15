package com.xworkz.touristplace.dao;

public interface TouristPlaceDAO {
	
	boolean save(String place);
	boolean checkName(String place);

}
