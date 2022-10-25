package com.xworkz.person.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.enums.MySqlPersonCredential;

public class PersonRepositoryImpl implements PersonRepository {
	public PersonRepositoryImpl() {
		System.out.println("Save" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(PersonDTO dto) {
		System.out.println("Running Person repository");

		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());
			Connection conn = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			/*
			 * String
			 * ref="INSERT INTO persondetail VALUES (1,'Prem','prem@gmail.com',9632915011,'Male','Diploma',false,"
			 * + "true,'BMTC',30000,27,3,'Yaladahalii','Maddur','Karnataka',\r\n" +
			 * "'India',551995007654,'LAEPP2772F',true,1234567890981);";
			 */

			String ref = "INSERT INTO persondetail VALUES (" + dto.getId() + ",'" + dto.getName() + "','"
					+ dto.getEmail() + "'," + dto.getMobileNumber() + ",'" + dto.getGender() + "'," + "'"
					+ dto.getQualification() + "'," + dto.getMarried() + "," + dto.getWorking() + ",'"
					+ dto.getCompanyName() + "'," + dto.getSalary() + "," + "'" + dto.getLocation() + "','"
					+ dto.getCity() + "','" + dto.getState() + "','" + dto.getCountry() + "'," + dto.getAadharNo() + ""
					+ ",'" + dto.getPanNo() + "'," + dto.getAlive() + "," + dto.getBankAccountNo() + ");";

			System.out.println(ref);

			Statement statement = conn.createStatement();
			int executed = statement.executeUpdate(ref);
			if (executed > 0) {
				System.out.println("Exicute the statement is done");
				return true;
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void displayAll() {
		System.out.println("Display All is running");

		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());

			Connection connection = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			String query = "SELECT * FROM persondetail";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				String email = result.getString(3);
				long mobileNumber = result.getLong(4);
				String gender = result.getString(5);
				String qualification = result.getString(6);
				Boolean married = result.getBoolean(7);
				Boolean working = result.getBoolean(8);
				String companyName = result.getString(9);
				double salary = result.getDouble(11);
				int age = result.getInt(12);
				int experience = result.getInt(13);
				String location = result.getString(14);
				String city = result.getString(15);
				String state = result.getString(16);
				String country = result.getString(17);
				long aadharNo = result.getLong(18);
				String panNo = result.getString(19);
				Boolean alive = result.getBoolean(20);
				long bankAccountNo = result.getLong(21);

				System.out.println(id + "" + name + "" + email + "" + mobileNumber + "" + gender + "" + qualification
						+ "" + married + "" + working + "" + companyName + "" + salary + "" + age + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + aadharNo + "" + panNo + "" + alive
						+ "" + bankAccountNo + "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}

	}

	@Override
	public void displayAllByGenderDescOrderByName(String gender) {
		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());

			Connection connection = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			String query = "SELECT * FROM persondetail WHERE gender='Male' ORDER BY name";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String email = result.getString(3);
				long mobileNumber = result.getLong(4);
				String gender1 = result.getString(5);
				String qualification = result.getString(6);
				Boolean married = result.getBoolean(7);
				Boolean working = result.getBoolean(8);
				String companyName = result.getString(9);
				double salary = result.getDouble(11);
				int age = result.getInt(12);
				int experience = result.getInt(13);
				String location = result.getString(14);
				String city = result.getString(15);
				String state = result.getString(16);
				String country = result.getString(17);
				long aadharNo = result.getLong(18);
				String panNo = result.getString(19);
				Boolean alive = result.getBoolean(20);
				long bankAccountNo = result.getLong(21);

				System.out.println(id + "" + name + "" + email + "" + mobileNumber + "" + gender1 + "" + qualification
						+ "" + married + "" + working + "" + companyName + "" + salary + "" + age + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + aadharNo + "" + panNo + "" + alive
						+ "" + bankAccountNo + "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllAgeGreaterThanOrderByName(int age) {
		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());

			Connection connection = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			String query = "SELECT * FROM persondetail WHERE age>=" + age + " ORDER BY name";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String email = result.getString(3);
				long mobileNumber = result.getLong(4);
				String gender1 = result.getString(5);
				String qualification = result.getString(6);
				Boolean married = result.getBoolean(7);
				Boolean working = result.getBoolean(8);
				String companyName = result.getString(9);
				double salary = result.getDouble(11);
				int age1 = result.getInt(12);
				int experience = result.getInt(13);
				String location = result.getString(14);
				String city = result.getString(15);
				String state = result.getString(16);
				String country = result.getString(17);
				long aadharNo = result.getLong(18);
				String panNo = result.getString(19);
				Boolean alive = result.getBoolean(20);
				long bankAccountNo = result.getLong(21);

				System.out.println(id + "" + name + "" + email + "" + mobileNumber + "" + gender1 + "" + qualification
						+ "" + married + "" + working + "" + companyName + "" + salary + "" + age1 + "" + experience
						+ "" + location + "" + city + "" + state + "" + country + "" + aadharNo + "" + panNo + ""
						+ alive + "" + bankAccountNo + "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayAllBySalaryGreaterThanOrderByDesc(double salary) {
		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());

			Connection connection = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			String query = "SELECT * FROM persondetail WHERE salary=" + salary + " ORDER BY name desc";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String email = result.getString(3);
				long mobileNumber = result.getLong(4);
				String gender1 = result.getString(5);
				String qualification = result.getString(6);
				Boolean married = result.getBoolean(7);
				Boolean working = result.getBoolean(8);
				String companyName = result.getString(9);
				double salary1 = result.getDouble(11);
				int age = result.getInt(12);
				int experience = result.getInt(13);
				String location = result.getString(14);
				String city = result.getString(15);
				String state = result.getString(16);
				String country = result.getString(17);
				long aadharNo = result.getLong(18);
				String panNo = result.getString(19);
				Boolean alive = result.getBoolean(20);
				long bankAccountNo = result.getLong(21);

				System.out.println(id + "" + name + "" + email + "" + mobileNumber + "" + gender1 + "" + qualification
						+ "" + married + "" + working + "" + companyName + "" + salary1 + "" + age + "" + experience
						+ "" + location + "" + city + "" + state + "" + country + "" + aadharNo + "" + panNo + ""
						+ alive + "" + bankAccountNo + "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displayCount() {
		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());

			Connection connection = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			String query = "SELECT Count(*) FROM persondetail";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String email = result.getString(3);
				long mobileNumber = result.getLong(4);
				String gender1 = result.getString(5);
				String qualification = result.getString(6);
				Boolean married = result.getBoolean(7);
				Boolean working = result.getBoolean(8);
				String companyName = result.getString(9);
				double salary = result.getDouble(11);
				int age = result.getInt(12);
				int experience = result.getInt(13);
				String location = result.getString(14);
				String city = result.getString(15);
				String state = result.getString(16);
				String country = result.getString(17);
				long aadharNo = result.getLong(18);
				String panNo = result.getString(19);
				Boolean alive = result.getBoolean(20);
				long bankAccountNo = result.getLong(21);

				System.out.println(id + "" + name + "" + email + "" + mobileNumber + "" + gender1 + "" + qualification
						+ "" + married + "" + working + "" + companyName + "" + salary + "" + age + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + aadharNo + "" + panNo + "" + alive
						+ "" + bankAccountNo + "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void displaySumOfSalary() {
		try {
			Class.forName(MySqlPersonCredential.JDBCDRIVER.getValue());

			Connection connection = DriverManager.getConnection(MySqlPersonCredential.URL.getValue(),
					MySqlPersonCredential.USERNAME.getValue(), MySqlPersonCredential.SECRET.getValue());

			String query = "SELECT SUM(salary) FROM persondetail";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

			while (result.next()) {

				int id = result.getInt(1);
				String name = result.getString(2);
				String email = result.getString(3);
				long mobileNumber = result.getLong(4);
				String gender1 = result.getString(5);
				String qualification = result.getString(6);
				Boolean married = result.getBoolean(7);
				Boolean working = result.getBoolean(8);
				String companyName = result.getString(9);
				double salary = result.getDouble(11);
				int age = result.getInt(12);
				int experience = result.getInt(13);
				String location = result.getString(14);
				String city = result.getString(15);
				String state = result.getString(16);
				String country = result.getString(17);
				long aadharNo = result.getLong(18);
				String panNo = result.getString(19);
				Boolean alive = result.getBoolean(20);
				long bankAccountNo = result.getLong(21);

				System.out.println(id + "" + name + "" + email + "" + mobileNumber + "" + gender1 + "" + qualification
						+ "" + married + "" + working + "" + companyName + "" + salary + "" + age + "" + experience + ""
						+ location + "" + city + "" + state + "" + country + "" + aadharNo + "" + panNo + "" + alive
						+ "" + bankAccountNo + "");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}