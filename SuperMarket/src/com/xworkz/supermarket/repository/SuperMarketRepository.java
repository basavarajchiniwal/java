package com.xworkz.supermarket.repository;

import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;

public interface SuperMarketRepository {
	
	boolean save(SuperMarketDTO dto);
	
	void displayByName(String name);
	
	void validateAndSave(List<SuperMarketDTO> dto);
	
	default SuperMarketDTO findByName(String name) {
		return null;
	}
	
	default SuperMarketDTO findById(int id) {
		return null;
	}
	
	List<SuperMarketDTO> findAll();
	
	List<SuperMarketDTO> findByType(String type);
	
	List<SuperMarketDTO> findByPincodeAndType(String type,int pincode);
	

}
