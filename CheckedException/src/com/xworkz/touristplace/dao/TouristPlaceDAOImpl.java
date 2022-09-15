package com.xworkz.touristplace.dao;

public class TouristPlaceDAOImpl implements TouristPlaceDAO {

	private String[] dataStore = new String[10];
	private int index;

	@Override
	public boolean save(String place) {
		this.dataStore[index] = place;
		System.out.println("dataStored:" + place + "index" + this.index);
		this.index++;
		return true;
	}

	@Override
	public boolean checkName(String place) {
		for (String ref : this.dataStore) 
			if (ref != null && ref.equals(place)) {
				System.out.println("Place is checked");
				return true;
			}
		return false;
	}

}
