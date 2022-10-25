package com.xworkz.database.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.database.dto.GarageDTO;
import com.xworkz.database.enumi.MySqlGarage;

public class GarageRepositoryImpl implements GarageRepository {
	
	public GarageRepositoryImpl() {
		System.out.println("save"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("running repository");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Load the Driver");
			
			Connection conn=DriverManager.getConnection(MySqlGarage.UPI.getValue(),MySqlGarage.USERNAME.getValue(),
					MySqlGarage.SECRET.getValue());
			System.out.println(conn);
			
			/*String mySql= "INSERT INTO garage VALUES("+dto.getId()+",'"+dto.getName()+"','"+dto.getOwner()+"',"
					+ ""+dto.getAreaInSquareMeter()+");";
			System.out.println("Generate sql :"+mySql);*/
			
			String mySql1="INSERT INTO garage VALUES('3','Spare','Swaraj','1100');";
			System.out.println("Generate sql :"+mySql1);
			
			Statement statement=conn.createStatement();
			statement.executeUpdate(mySql1);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

}
