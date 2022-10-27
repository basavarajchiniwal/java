package com.xworkz.supermarket.service;

import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;

public interface SuperMarketService {
	
	boolean validateAndSave(SuperMarketDTO dto);
	
	void displayByName(String name);
	
	void validateAndSave(List<SuperMarketDTO> dto);

}
