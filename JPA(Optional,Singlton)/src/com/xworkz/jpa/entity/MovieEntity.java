package com.xworkz.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movie_detail")
public class MovieEntity {
	
	@Id
	private int id;
	private String name;
	private String heroName;
	private String heroineName;
	private String producer;

}
