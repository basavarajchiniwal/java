package com.xworkz.supermarket.repository;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.supermarket.dto.SuperMarketDTO;
import com.xworkz.supermarket.enumm.SuperMarketCredential;

public class SuperMarketRepositoryImpl implements SuperMarketRepository{

	@Override
	public boolean save(SuperMarketDTO dto) {
		
		System.out.println("Running repository");
		try {
		String sql="INSERT INTO supermarket VALUES(?,?,?,?,?,?);";
		
			PreparedStatement statement= this.getConnection().prepareStatement(sql);
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getCompany());
			statement.setString(4, dto.getGstNo());
			statement.setInt(5, dto.getPincode());
			statement.setString(6, dto.getType());
			
			int executed=statement.executeUpdate();
			if(executed>0) {
				System.out.println("Execute and update is done");
			}
		} catch (SQLException e) {
			e.getMessage();
		}		
		return true;
	}

	@Override
	public void displayByName(String name) {
		
		Connection connect=this.getConnection();
		String sql="SELECT * FROM supermarket WHERE name=?";
		
		try {
			PreparedStatement statement= connect.prepareStatement(sql);
			statement.setString(1, name);
			
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				/*int id=result.getInt(1);
				String naam=result.getString(2);
				String company=result.getString(3);
				String gstNo=result.getString(4);
				int pincode=result.getInt(5);
				String type=result.getString(6);*/
				
				displayResult(result);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	private Connection getConnection() {
		Connection connect = null;
		try {
			connect = DriverManager.getConnection(SuperMarketCredential.URL.getValue(), SuperMarketCredential.USERNAME.getValue(),
					SuperMarketCredential.SECRET.getValue());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connect;

	}
	
	private void displayResult(ResultSet result) throws SQLException {
		int id=result.getInt(1);
		String naam=result.getString(2);
		String company=result.getString(3);
		String gstNo=result.getString(4);
		int pincode=result.getInt(5);
		String type=result.getString(6);
		
		System.out.println(id);
		System.out.println(naam);
		System.out.println(company);
		System.out.println(gstNo);
		System.out.println(pincode);
		System.out.println(type);
	}

	@Override
	public void validateAndSave(List<SuperMarketDTO> dto) {
		
		Connection connect=this.getConnection();
		String sql="";
		
		try {
			PreparedStatement statement=connect.prepareStatement(sql);
			statement.setArray(1, (Array) dto);
			
			ResultSet result=statement.executeQuery();
			while(result.next()) {
				displayResult(result);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
