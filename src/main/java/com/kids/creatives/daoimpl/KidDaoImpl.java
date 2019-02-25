package com.kids.creatives.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kids.creatives.dao.KidDao;
import com.kids.creatives.entities.Kid;

@Repository
public class KidDaoImpl implements KidDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveKids(Kid kid) {
		
		Session session = sessionFactory.getCurrentSession();
		
	}

	@Override
	public List<Kid> getKids() {

		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

	@Override
	public Kid getKid(int id) {

		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

	@Override
	public List<Kid> parentsKids(int parentId) {

		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

}
