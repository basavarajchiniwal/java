package com.xworkz.database.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.database.dto.HospitalDTO;
import com.xworkz.database.enumi.MySqlHospital;

public class HospitalRepositoryImpl implements HospitalRepository {

	public HospitalRepositoryImpl() {
		System.out.println("save"+ this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(HospitalDTO dto) {
		System.out.println("Running repository");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //load the Driver and internally register the driver
			//com.mysql.cj.jdbc.Driver-->this is FQN given by vendor
			//which is surrounded by try catch
			//loading the driver explicitly
			//[Driver driver; //loading the driver implicitly]
			System.out.println("Load the Driver");
			
			Connection connect=DriverManager.getConnection(MySqlHospital.URL.getValue(), MySqlHospital.USERNAME.getValue(), MySqlHospital.SECRET.getValue());
			System.out.println(connect);
			
			//String sql= ("INSERT INTO hospitaldetail VALUES(1,'G Madegowda','G Madegowda Super Speciality','Normal',2019);");
			String sql= "INSERT INTO hospitaldetail VALUES("+dto.getId()+",'"+dto.getFounder()+"','"+dto.getName()+"','"+dto.getSpecialist()+"',"+dto.getSince()+");";
			System.out.println("Generate sql :"+ sql);
			
			Statement statement=connect.createStatement();
			
			int executed=statement.executeUpdate(sql);
			if(executed>0)
			{
				System.out.println("Exicute the statement is done");
				return true;
			}		
			
		} catch (ClassNotFoundException | SQLException e) { //try with multicatch
			//e.printStackTrace();
			e.getMessage();
		}

		return true;
	}

}
