package com.kids.creatives.servicesimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kids.creatives.entities.Organization;
import com.kids.creatives.services.OrganizationServices;

@Service
public class OrganizationServicesImpl implements OrganizationServices {

	@Override
	@Transactional
	public void addOrg(Organization orginization) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Organization getOrganization(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
