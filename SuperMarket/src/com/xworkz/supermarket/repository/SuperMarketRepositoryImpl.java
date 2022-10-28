package com.xworkz.supermarket.repository;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
			
			resultSet(statement);
			
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
		String sql="INSERT INTO supermarket VALUES(?,?,?,?,?,?)";
		
		try {
			PreparedStatement statement=connect.prepareStatement(sql);
			
			for (SuperMarketDTO superMarketDTO : dto) {
				statement.setInt(1, superMarketDTO.getId());
				statement.setString(2, superMarketDTO.getName());
				statement.setString(3, superMarketDTO.getCompany());
				statement.setString(4, superMarketDTO.getGstNo());
				statement.setInt(5, superMarketDTO.getPincode());
				statement.setString(6, superMarketDTO.getType());
				
				int execute=statement.executeUpdate();
				if(execute>0) {
					System.out.println(execute);
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private void resultSet(PreparedStatement statement) throws SQLException {
		ResultSet result=statement.executeQuery();
		while(result.next()) {
			displayResult(result);
		}
	}
	
	@Override
	public SuperMarketDTO findByName(String name) {
		Connection conn=this.getConnection();
		
		String sql="SELECT * FROM supermarket WHERE name=?";
		
		try {
			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			preparedStatement.setString(1, name);
			
			ResultSet result=preparedStatement.executeQuery();
			while(result.next()) {
			int id=result.getInt(1);
			String naam=result.getString(2);
			String company=result.getString(3);
			String gstNo=result.getString(4);
			int pincode=result.getInt(5);
			String type=result.getString(6);
			
			SuperMarketDTO superMarketDTO1=new SuperMarketDTO(id,naam,company,gstNo,pincode,type);	

			System.out.println(superMarketDTO1);
			return superMarketDTO1;}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 	
		return SuperMarketRepository.super.findByName(name);
	}
	
	@Override
	public SuperMarketDTO findById(int id) {
		Connection conn=this.getConnection();
		
		String sql="SELECT * FROM supermarket WHERE id=?";
		
		try {
			PreparedStatement preparedStatement=conn.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			ResultSet result=preparedStatement.executeQuery();
			while(result.next()) {
			int id1=result.getInt(1);
			String naam=result.getString(2);
			String company=result.getString(3);
			String gstNo=result.getString(4);
			int pincode=result.getInt(5);
			String type=result.getString(6);
			
			SuperMarketDTO superMarketDTO1=new SuperMarketDTO(id1,naam,company,gstNo,pincode,type);	

			System.out.println(superMarketDTO1);
			return superMarketDTO1;}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SuperMarketRepository.super.findById(id);
	}
	
	
	@Override
	public List<SuperMarketDTO> findAll() {
		
		Connection cont=this.getConnection();
		String sql="SELECT * FROM supermarket";
		try {
			PreparedStatement state=cont.prepareStatement(sql);
			ResultSet result=state.executeQuery();
			List<SuperMarketDTO> list=new ArrayList<SuperMarketDTO>();
			while(result.next()) {
				int id=result.getInt(1);
				String naam=result.getString(2);
				String company=result.getString(3);
				String gstNo=result.getString(4);
				int pincode=result.getInt(5);
				String type=result.getString(6);
				
				SuperMarketDTO dto1=new SuperMarketDTO(id,naam,company,gstNo,pincode,type);
				list.add(dto1);
			}
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public List<SuperMarketDTO> findByPincodeAndType(String type, int pincode) {
		
		Connection cont=this.getConnection();
		String sql="SELECT * FROM supermarket WHERE (pincode=? AND type=?);";
		try {
			PreparedStatement state=cont.prepareStatement(sql);
			state.setInt(1, pincode);
			state.setString(2, type);
			ResultSet result=state.executeQuery();
			
			List<SuperMarketDTO> list1=new ArrayList<SuperMarketDTO>();
			while(result.next()) {
				int id=result.getInt(1);
				String naam=result.getString(2);
				String company=result.getString(3);
				String gstNo=result.getString(4);
				int pincode1=result.getInt(5);
				String type1=result.getString(6);
				
				SuperMarketDTO dto2=new SuperMarketDTO(id,naam,company,gstNo,pincode1,type1);
				list1.add(dto2);
			}
			return list1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	
	@Override
	public List<SuperMarketDTO> findByType(String type) {
		
		Connection connection=this.getConnection();
		String sql="SELECT * FROM supermarket WHERE type=?";
		try {
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, type);
			ResultSet result=statement.executeQuery();			
			List<SuperMarketDTO> list1=new ArrayList<SuperMarketDTO>();
			while(result.next()) {
				int id=result.getInt(1);
				String naam=result.getString(2);
				String company=result.getString(3);
				String gstNo=result.getString(4);
				int pincode1=result.getInt(5);
				String type1=result.getString(6);
				
				SuperMarketDTO dto2=new SuperMarketDTO(id,naam,company,gstNo,pincode1,type1);
				list1.add(dto2);
			}
			return list1;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
