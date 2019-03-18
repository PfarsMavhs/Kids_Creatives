package com.kids.creatives.services;

import java.util.List;

import com.kids.creatives.entities.Parents;

public interface ParentsServices {

	public void addParents(Parents parent);
	public List<Parents> getParents();
	public Parents getParent(int userId);
}
