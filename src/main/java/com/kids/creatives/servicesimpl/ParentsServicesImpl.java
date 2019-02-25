package com.kids.creatives.servicesimpl;

import java.util.List;

import org.hibernate.annotations.Parent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kids.creatives.services.ParentsServices;

@Service
public class ParentsServicesImpl implements ParentsServices{

	@Override
	@Transactional
	public void addParents(Parent parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Parent> getParents(Parent parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Parent getParent(Parent parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
