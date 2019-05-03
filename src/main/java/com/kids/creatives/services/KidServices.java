package com.kids.creatives.services;

import java.util.List;

import com.kids.creatives.entities.Kid;

public interface KidServices {
	
	public void saveKids(Kid kid);
	public List<Kid> kidsResults();
	public Kid getKid(int id);
	//public List<Kid> parentsKids(int )parentId;

}
