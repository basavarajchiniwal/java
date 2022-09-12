package com.xworkz.data.main;

import com.xworkz.data.dao.MovieDAO;
import com.xworkz.data.dao.MovieDAOImpl;
import com.xworkz.data.dto.MovieDTO;

public class MovieMain {

	public static void main(String[] args) {
		MovieDTO dto=new MovieDTO();
		String[] actors= {"Srikanth","Rangayana Raghu","Padmaj Rao","Sudha"};
		dto.setActorNames(actors);
		dto.setCameraMan("RaviKumar");
		dto.setDirector("Govinda Raju");
		dto.setEditer("Sundar");
		dto.setHeroineName("Mansukhani");
		dto.setHeroName("Srikanth");
		dto.setMovieName("Olave Mandara");
		dto.setMusician("Sharan Hruday");
		dto.setProducer("Nazzar");
		dto.setProfit(2360.02);
		dto.setShootingLocation("MadyaPradesh");
		dto.setType("LoveStory");
		dto.setViewIn("Screen");
		dto.setVillanName("Gopinand");
		dto.setWritter("Gurunath");
		
		MovieDAO dao=new MovieDAOImpl();
		dao.create(dto);

	}

}
