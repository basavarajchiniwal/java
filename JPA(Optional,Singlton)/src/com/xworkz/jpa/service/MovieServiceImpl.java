package com.xworkz.jpa.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.entity.MovieEntity;
import com.xworkz.jpa.repo.MovieRepo;
import com.xworkz.jpa.repo.MovieRepoImpl;

public class MovieServiceImpl implements MovieService {

	private MovieRepo repo=new MovieRepoImpl();
	
	@Override
	public boolean validateAndSave(MovieEntity entity) {
		int id=entity.getId();
		String name=entity.getName();
		String heroName=entity.getHeroName();
		String heroineName=entity.getHeroineName();
		String producer=entity.getProducer();
		
		if(id>0) {
			System.out.println("id is valid");
			if(name !=null && name.length()>2)
			{
				System.out.println("name valid");
				if(heroName !=null && heroName.length()>1)
				{
					System.out.println("heroName is valid");
					if(heroineName !=null && heroineName.length()>2)
					{
						System.out.println("heroineName valid");
						if(producer != null && producer.length()>3)
						{
							System.out.println("producer valid");
							
							System.out.println("All are valid");
							this.repo.save(entity);
							//repo.save(entity);
						}
						else {
							System.err.println("producer invalid");
						}
					}
					else {
						System.err.println("heroineName invalid");
					}
				}
				else {
					System.err.println("heroName invalid");
				}
			}
			else {
				System.err.println("name invalid");
			}
		}
		else {
			System.err.println("id invalid");
		}
		
		return false;
	}
	
	@Override
	public void save(List<MovieEntity> list) {
		
		this.repo.save(list);
	}

	@Override
	public Optional<MovieEntity> findById(int id) {
		
		if(id>0) {
			System.out.println("id is valid");
			repo.findById(id);
		}
		
		return Optional.empty();
	}

	@Override
	public void updateNameById(int id, String name) {
		
		if(id>0)
		{
			this.repo.updateNameById(id,name);
		}
		MovieService.super.updateNameById(id, name);
	}
	
	@Override
	public void deleteById(int id) {
		if(id>0)
		{
			this.repo.deleteById(id);
		}
		MovieService.super.deleteById(id);
	}

}
