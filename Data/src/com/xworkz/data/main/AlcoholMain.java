package com.xworkz.data.main;

import com.xworkz.data.dao.AlcoholDAO;
import com.xworkz.data.dao.AlcoholDAOImpl;
import com.xworkz.data.dto.AlcoholDTO;

public class AlcoholMain {

	public static void main(String[] args) {
		
		AlcoholDTO dto=new AlcoholDTO();
		dto.setBoilingPoint(7.3);
		dto.setConjugateAcid("Ethoxide");
		dto.setConjugatebase("Alkoxide");
		dto.setDensity(20.05);
		dto.setFlamable(false);
		dto.setGroup("liquid");
		dto.setHazardous("Health Hazardous");
		dto.setMeltingPoint(56.02);
		dto.setMolecularWeight(2.3);
		dto.setNature("Drink");
		dto.setNoOfCarbon(10);
		dto.setPh(7.3);
		dto.setSolubleInWater(false);
		dto.setTaste("Tasteless");
		dto.setToxicRange(1.23);
		dto.setVapourPressure(10.56);
		
		AlcoholDAO dao=new AlcoholDAOImpl();
		dao.create(dto);

	}

}
