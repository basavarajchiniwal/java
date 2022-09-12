package com.xworkz.data.main;

import com.xworkz.data.dao.ApartmentDAO;
import com.xworkz.data.dao.ApartmentDAOImpl;
import com.xworkz.data.dto.ApartmentDTO;

public class ApartmentMain {

	public static void main(String[] args) {
		ApartmentDTO apt=new ApartmentDTO();
		apt.setApartmentName("Prestige");
		apt.setApartType("High rise building");
		apt.setArea("KonanakunteCross");
		apt.setBelongCity("Bengaluru");
		apt.setCorporatorName("Corporate");
		apt.setDistrict("Bengaluru");
		apt.setLandArea("12.30units");
		apt.setNoOfBlocks(2000);
		apt.setOwnerName("Prasad");
		apt.setPaintColour("pink");
		apt.setPaymentType("Cash");
		String[] names= {"Fouzen","Kiran","Wassim"};
		apt.setSecurityNames(names);
		apt.setSecurityshift("Day and Night");
		apt.setTaluk("Bengaluru");
		apt.setTotalArea(23.64);
		
		ApartmentDAO dao=new ApartmentDAOImpl();
		dao.create(apt);

	}

}
