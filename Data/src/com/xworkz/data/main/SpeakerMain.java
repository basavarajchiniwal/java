package com.xworkz.data.main;

import com.xworkz.data.dao.SpeakerDAO;
import com.xworkz.data.dao.SpeakerDAOImpl;
import com.xworkz.data.dto.SpeakerDTO;

public class SpeakerMain {

	public static void main(String[] args) {
		
		SpeakerDTO speak=new SpeakerDTO();
		speak.setBrandName("Boat");
		speak.setCarryType("Easy");
		speak.setChargeSystem(true);
		speak.setColor("Black");
		speak.setFrequencyRange("20Hz-20kHz");
		speak.setNoOfUsers(10000);
		speak.setPrice(5000.50);
		speak.setQuality("Good");
		speak.setSize(12.05);
		speak.setSoundsLevel("Good");
		speak.setType("Wireless");
		speak.setUseful(true);
		speak.setVolumeRange("70-80 dB");
		speak.setWatts(50);
		speak.setWeight(5.09);
		
		SpeakerDAO dao=new SpeakerDAOImpl();
		dao.create(speak);

	}

}
