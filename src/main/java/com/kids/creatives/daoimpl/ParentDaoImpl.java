package com.kids.creatives.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parent;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kids.creatives.dao.ParentsDAO;
import com.kids.creatives.entities.Parents;

@Repository
public class ParentDaoImpl implements ParentsDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addParents(Parents parent) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(parent);
		
	}

	@Override
	public List<Parents> getParents() {

		Session session = sessionFactory.getCurrentSession();
		
		Query<Parents> parentQuery = session.createQuery("from Parents",Parents.class);
		
		List<Parents> parentsList  = parentQuery.getResultList();
		
				
		return parentsList;
	}

	@Override
	public Parents getParent(int userId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Parents parents = session.get(Parents.class, userId);
		return parents;
	}

}
