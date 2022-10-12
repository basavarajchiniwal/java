package com.xworkz.database.dto;

public class HospitalDTO {
	
	private int id;
	private String founder;
	private String name;
	private String specialist;
	private int since;
	
	public HospitalDTO() {
		System.out.println("Default Constructor");
	}

	public HospitalDTO(int id, String founder, String name, String specialist, int since) {
		super();
		this.id = id;
		this.founder = founder;
		this.name = name;
		this.specialist = specialist;
		this.since = since;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "HospitalDTO [id=" + id + ", founder=" + founder + ", name=" + name + ", specialist=" + specialist
				+ ", since=" + since + "]";
	}
	
}
