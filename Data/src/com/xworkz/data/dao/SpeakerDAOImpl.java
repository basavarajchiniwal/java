package com.xworkz.data.dao;

import com.xworkz.data.dto.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO{
	
	private SpeakerDTO[] speaker=new SpeakerDTO[14];
	private int index=0;
	
	@Override
	public boolean create(SpeakerDTO dto) {
		this.speaker[index]=dto;
		System.out.println("Speaker is,"+dto+"into index"+this.index);
		this.index++;
		return true;
	}
	
	

}
