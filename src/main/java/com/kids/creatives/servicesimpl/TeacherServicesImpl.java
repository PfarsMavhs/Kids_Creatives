package com.kids.creatives.servicesimpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kids.creatives.entities.Teachers;
import com.kids.creatives.services.TeacherServices;

@Service
public class TeacherServicesImpl implements TeacherServices {

	@Override
	@Transactional
	public void addTeacher(Teachers teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Teachers> getTeachers(Teachers teachers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Teachers getTeacher(String grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Teachers getTeacher(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
