package com.xworkz.data.dto;

import java.io.Serializable;
import java.util.Arrays;

public class MovieDTO implements Serializable{
	
	private String movieName;
	private String heroName;
	private String heroineName;
	private String villanName;
	private String[] actorNames;
	private String director;
	private String producer;
	private String musician;
	private String writter;
	private String shootingLocation;
	private String viewIn;
	private String type;
	private Double profit;
	private String cameraMan;
	private String editer;
	
	public MovieDTO() {
		System.out.println("Movie default constructor");
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName
				+ ", villanName=" + villanName + ", actorNames=" + Arrays.toString(actorNames) + ", director="
				+ director + ", producer=" + producer + ", musician=" + musician + ", writter=" + writter
				+ ", shootingLocation=" + shootingLocation + ", viewIn=" + viewIn + ", type=" + type + ", profit="
				+ profit + ", cameraMan=" + cameraMan + ", editer=" + editer + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroineName() {
		return heroineName;
	}

	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}

	public String getVillanName() {
		return villanName;
	}

	public void setVillanName(String villanName) {
		this.villanName = villanName;
	}

	public String[] getActorNames() {
		return actorNames;
	}

	public void setActorNames(String[] actorNames) {
		this.actorNames = actorNames;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getMusician() {
		return musician;
	}

	public void setMusician(String musician) {
		this.musician = musician;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	public String getShootingLocation() {
		return shootingLocation;
	}

	public void setShootingLocation(String shootingLocation) {
		this.shootingLocation = shootingLocation;
	}

	public String getViewIn() {
		return viewIn;
	}

	public void setViewIn(String viewIn) {
		this.viewIn = viewIn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public String getCameraMan() {
		return cameraMan;
	}

	public void setCameraMan(String cameraMan) {
		this.cameraMan = cameraMan;
	}

	public String getEditer() {
		return editer;
	}

	public void setEditer(String editer) {
		this.editer = editer;
	}
	
	

}
