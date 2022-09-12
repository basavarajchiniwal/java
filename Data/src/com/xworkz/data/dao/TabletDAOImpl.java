package com.xworkz.data.dao;

import com.xworkz.data.dto.TabletDTO;

public class TabletDAOImpl implements TabletDAO{

	private TabletDTO[] tab=new TabletDTO[14];
	private int index=0;
	@Override
	public boolean create(TabletDTO tablet) {
		this.tab[index]=tablet;
		System.out.println("Tablet is,"+tablet+"into index"+this.index);
		this.index++;
		return true;
	}
}
