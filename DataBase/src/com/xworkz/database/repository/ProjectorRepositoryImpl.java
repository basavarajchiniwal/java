package com.xworkz.database.repository;

import com.xworkz.database.dto.ProjectorDTO;

public class ProjectorRepositoryImpl implements ProjectorRepository {

	public ProjectorRepositoryImpl() {
		System.out.println("save" + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(ProjectorDTO dto) {
		System.out.println("running repository");
		return true;
	}

}
