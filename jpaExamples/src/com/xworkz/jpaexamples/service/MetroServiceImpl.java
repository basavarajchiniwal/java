package com.xworkz.jpaexamples.service;


import com.xworkz.jpaexamples.entity.MetroEntity;
import com.xworkz.jpaexamples.repo.MetroRepository;

public class MetroServiceImpl implements MetroService {

	private MetroRepository repos;
	
	public MetroServiceImpl(MetroRepository repos) {
		this.repos=repos;
	}
	@Override
	public boolean validateAndSave(MetroEntity entity) {
		
		int id=entity.getId();
		String metroLine=entity.getMetroLine();
		String metroName=entity.getMetroName();
		int started=entity.getStarted();
		double price=entity.getPrice();
		String owner=entity.getOwner();
		int noOfLines=entity.getNoOfLines();
		double trainLength=entity.getTrainLength();
		int noOfStations=entity.getNoOfStations();
		double maxSpeed=entity.getMaxSpeed();
		String webSite=entity.getWebSite();
		
		if(id>0) {
			System.out.println("Id is valid");
		}
		else {
			return false;
		}
		if(metroLine != null && metroLine.length()>1) {
			System.out.println("MetroLine is valid");
		}
		else {
			return false;
		}
		if(metroName != null && metroName.length()>1) {
			System.out.println("metroName is valid");
		}
		else {
			return false;
		}
		if(started>1900) {
			System.out.println("started is valid");
		}
		else {
			return false;
		}
		if(price>0) {
			System.out.println("price is valid");
		}
		else {
			return false;
		}
		if(owner != null && owner.length()>2) {
			System.out.println("owner is valid");
		}
		else {
			return false;
		}
		if(noOfLines>0) {
			System.out.println("noOfLines is valid");
		}
		else {
			return false;
		}
		if(trainLength>0) {
			System.out.println("trainLength is valid");
		}
		else {
			return false;
		}
		if(noOfStations>0) {
			System.out.println("noOfStations is valid");
		}
		else {
			return false;
		}
		if(maxSpeed>0) {
			System.out.println("maxSpeed is valid");
		}
		else {
			return false;
		}
		if(webSite != null && webSite.length()>5) {
			System.out.println("webSite is valid");
		}
		else {
			return false;
		}		
		return repos.save(entity);
	}

}
