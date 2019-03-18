package com.kids.creatives.servicesimpl;

import java.util.List;

import org.hibernate.annotations.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kids.creatives.dao.ParentsDAO;
import com.kids.creatives.entities.Parents;
import com.kids.creatives.services.ParentsServices;

@Service
public class ParentsServicesImpl implements ParentsServices{

	@Autowired
	ParentsDAO parentDao;
	
	@Override
	@Transactional
	public void addParents(Parents parent) {
		
		parentDao.addParents(parent);
		
	}

	@Override
	@Transactional
	public List<Parents> getParents() {

		
		return parentDao.getParents();
	}

	@Override
	@Transactional
	public Parents getParent(int userId) {
		
		return parentDao.getParent(userId);
	}

}
