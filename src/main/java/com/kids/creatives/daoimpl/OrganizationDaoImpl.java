package com.kids.creatives.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kids.creatives.dao.OrganizationDao;
import com.kids.creatives.entities.Organization;

@Repository
public class OrganizationDaoImpl implements OrganizationDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addOrg(Organization orginization) {
		
		Session session = sessionFactory.getCurrentSession();
		
	}

	@Override
	public Organization getOrganization(Organization organization) {

		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

}
