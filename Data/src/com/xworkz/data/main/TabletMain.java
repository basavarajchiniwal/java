package com.xworkz.data.main;

import com.xworkz.data.dao.TabletDAO;
import com.xworkz.data.dao.TabletDAOImpl;
import com.xworkz.data.dto.TabletDTO;

public class TabletMain {

	public static void main(String[] args) {
		
		TabletDTO tabet=new TabletDTO();
		tabet.setColor("Half White");
		tabet.setComposition("Paracetamol");
		tabet.setCost(11.50);
		tabet.setDrugClass("NSAIDs");
		tabet.setMadeIn("India");
		tabet.setManufacturer("Micro Lab Limited");
		tabet.setMg(600);
		tabet.setName("Dolo 650");
		tabet.setOtherName("Acetaminophen");
		tabet.setPrescribedBy("Doctors");
		tabet.setShape("Elical");
		tabet.setSolubleInWater(true);
		tabet.setStoredIn("Low Temperature");
		tabet.setUseFor("Fever");
		tabet.setWeight(0.5);
		
		TabletDAO dao=new TabletDAOImpl();
		dao.create(tabet);
	}

}
