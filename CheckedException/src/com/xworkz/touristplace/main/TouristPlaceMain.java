package com.xworkz.touristplace.main;

import com.xworkz.touristplace.dao.TouristPlaceDAO;
import com.xworkz.touristplace.dao.TouristPlaceDAOImpl;
import com.xworkz.touristplace.exception.TouristPlaceValidException;
import com.xworkz.touristplace.service.TouristPlaceService;
import com.xworkz.touristplace.service.TouristPlaceServiceImpl;

public class TouristPlaceMain {

	public static void main(String[] args) {

		TouristPlaceDAO touristPlace = new TouristPlaceDAOImpl();
	
		TouristPlaceService tps = new TouristPlaceServiceImpl(touristPlace);

		try {
			tps.checkAndValidate("Lalbagh Botanical Garden");
			tps.checkAndValidate("Mysore Palace");
			tps.checkAndValidate("Mysore Zoo");
			tps.checkAndValidate("KRS");
			tps.checkAndValidate("Chamundi Hill");
			tps.checkAndValidate("Karnal Karagruh");
			tps.checkAndValidate("GolGumbaz");
			tps.checkAndValidate("Badam");
			tps.checkAndValidate("Iskan Temple");
			tps.checkAndValidate("Cubbon Park");

		} catch (TouristPlaceValidException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getClass());

		}

	}

}
