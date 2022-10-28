package com.xworkz.supermarket.service;

import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;

public interface SuperMarketService {
	
	boolean validateAndSave(SuperMarketDTO dto);
	
	void displayByName(String name);
	
	void validateAndSave(List<SuperMarketDTO> dto);
	
	default SuperMarketDTO findByName(String name) {
		return null;
	}
	
	default SuperMarketDTO findById(int id) {
		return null;
	}
	
	List<SuperMarketDTO> findAll();
	
	List<SuperMarketDTO> findByPincodeAndType(String type,int pincode);
	
	List<SuperMarketDTO> findByType(String type);

}
