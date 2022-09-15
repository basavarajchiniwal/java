package com.xworkz.touristplace.service;

import com.xworkz.touristplace.exception.TouristPlaceValidException;

public interface TouristPlaceService {
	
	boolean checkAndValidate(String place)throws TouristPlaceValidException;

}
