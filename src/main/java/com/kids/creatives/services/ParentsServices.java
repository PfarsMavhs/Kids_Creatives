package com.kids.creatives.services;

import java.util.List;

import org.hibernate.annotations.Parent;

public interface ParentsServices {

	public void addParents(Parent parent);
	public List<Parent> getParents(Parent parent);
	public Parent getParent(Parent parent);
}
