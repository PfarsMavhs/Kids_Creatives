package com.kids.creatives.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kids.creatives.entities.Kid;
import com.kids.creatives.services.KidServices;

@Service
public class KidServicesImpl implements KidServices{

	@Override
	@Transactional
	public void saveKids(Kid kid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Kid> getKids() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Kid getKid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Kid> parentsKids(int parentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
