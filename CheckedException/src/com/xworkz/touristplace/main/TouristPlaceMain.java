package com.xworkz.touristplace.main;

import com.xworkz.touristplace.dao.TouristPlaceDAO;
import com.xworkz.touristplace.dao.TouristPlaceDAOImpl;
import com.xworkz.touristplace.exception.TouristPlaceValidException;
import com.xworkz.touristplace.service.TouristPlaceService;
import com.xworkz.touristplace.service.TouristPlaceServiceImpl;

public class TouristPlaceMain {

	public static void main(String[] args) {

		TouristPlaceDAO touristPlace = new TouristPlaceDAOImpl();

		touristPlace.save("Mysore Palace");
		touristPlace.save("Mysore Zoo");
		touristPlace.save("KRS");
		touristPlace.save("Chamundi Hill");
		touristPlace.save("Karnal Karagruh");
		touristPlace.save("GolGumbaz");
		touristPlace.save("Badam");
		touristPlace.save("Lalbagh Botanical Garden");
		touristPlace.save("Iskan Temple");
		touristPlace.save("Cubbon Park");
		
		TouristPlaceService tps = new TouristPlaceServiceImpl(touristPlace);

		try {
			tps.checkAndValidate("Lalbagh Botanical Garden");

		} catch (TouristPlaceValidException exp) {
			System.err.println("===");

		}

	}

}
