package com.kids.creatives.dao;

import java.util.List;

import org.hibernate.annotations.Parent;

public interface ParentsDAO {

	public void addParents(Parent parent);
	public List<Parent> getParents(Parent parent);
	public Parent getParent(Parent parent);
	
}
