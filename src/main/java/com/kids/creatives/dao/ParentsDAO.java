package com.kids.creatives.dao;

import java.util.List;

import com.kids.creatives.entities.Parents;

public interface ParentsDAO {

	public void addParents(Parents parent);
	public List<Parents> getParents();
	public Parents getParent(int userId);
	
}
