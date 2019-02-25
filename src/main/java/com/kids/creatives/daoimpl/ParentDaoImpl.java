package com.kids.creatives.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kids.creatives.dao.ParentsDao;

@Repository
public class ParentDaoImpl implements ParentsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addParents(Parent parent) {
		
		Session session = sessionFactory.getCurrentSession();
		
	}

	@Override
	public List<Parent> getParents(Parent parent) {

		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

	@Override
	public Parent getParent(Parent parent) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

}
