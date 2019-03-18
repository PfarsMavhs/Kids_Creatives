package com.kids.creatives.dao;

import java.util.List;

import com.kids.creatives.entities.Kid;

public interface KidDAO {
	
	
	public void saveKids(Kid kid);
	public List<Kid> getKids();
	public Kid getKid(int id);
	
	public List<Kid> parentsKids(int parentId);
	
	
}
