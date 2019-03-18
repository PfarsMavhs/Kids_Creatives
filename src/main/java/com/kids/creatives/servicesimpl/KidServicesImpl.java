package com.kids.creatives.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kids.creatives.dao.KidDAO;
import com.kids.creatives.entities.Kid;
import com.kids.creatives.services.KidServices;

@Service
public class KidServicesImpl implements KidServices{

	@Autowired
	KidDAO kidDAO;
	
	@Override
	@Transactional
	public void saveKids(Kid kid) {
		
		kidDAO.saveKids(kid);
	}

	@Override
	@Transactional
	public List<Kid> kidsResults() {
		
		return kidDAO.getKids();
	}

	@Override
	@Transactional
	public Kid getKid(int id) {
		
		return kidDAO.getKid(id);
	}

	@Override
	@Transactional
	public List<Kid> parentsKids(int parentId) {
		
		return kidDAO.parentsKids(parentId);
	}

}
