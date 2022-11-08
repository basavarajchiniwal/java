package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repo.HumanRepo;

public class HumanServiceImpl implements HumanService {

	private HumanRepo repo;
	public HumanServiceImpl(HumanRepo repo) {
		this.repo=repo;
	}
	@Override
	public boolean validate(HumanEntity entity) {
		
		int id=entity.getId();
		String name=entity.getName();
		double length=entity.getLength();
		
		if(id>0) {
			System.out.println("id is valid");
		}
		else {
			return false;
		}
		if(name != null && name.length()>3) {
			System.out.println("name is valid");
		}
		else {
			return false;
		}
		if(length>0) {
			System.out.println("length is valid");
		}
		else {
			return false;
		}	
		
		return this.repo.save(entity);
	}

	@Override
	public Optional<HumanEntity> findById(int id) {
		if(id>0)
		{
			return this.repo.findById(id);
		}
		return Optional.empty();
	}
	
	@Override
	public void updateNameById(String name, int id) {
		if(id>0)
		{
			this.repo.updateNameById(name,id);
		}
		HumanService.super.updateNameById(name, id);
	}

	@Override
	public void deleteLengthById(double length, int id) {
		
		if(id>0)
		{
			this.repo.deleteLengthById(length, id);
		}
		HumanService.super.deleteLengthById(length, id);
	}
}
