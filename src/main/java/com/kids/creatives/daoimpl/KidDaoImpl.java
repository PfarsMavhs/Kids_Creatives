package com.kids.creatives.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kids.creatives.dao.KidDao;
import com.kids.creatives.entities.Kid;

@Repository
public class KidDaoImpl implements KidDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveKids(Kid kid) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(kid);
		
	}

	@Override
	public List<Kid> getKids() {

		Session session = sessionFactory.getCurrentSession();
		
		Query<Kid> kidsQuery = session.createQuery("from Kid order by name",Kid.class);
		
		List<Kid> kidsResults  = kidsQuery.getResultList();
		
		return kidsResults;
	}

	@Override
	public Kid getKid(int id) {

		Session session = sessionFactory.getCurrentSession();
		
		Kid kid = session.get(Kid.class, id);
		
		return kid;
	}

	@Override
	public List<Kid> parentsKids(int parentId) {

		Session session = sessionFactory.getCurrentSession();
		
		Query<Kid> parentKidQuery = session.createQuery("from Kid where parentid = "+parentId+" ",Kid.class);
		
		List<Kid> kids = parentKidQuery.getResultList();
		return kids;
	}

}
