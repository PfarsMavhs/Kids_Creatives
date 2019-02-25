package com.kids.creatives.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kids.creatives.dao.TeachersDao;
import com.kids.creatives.entities.Teachers;

@Repository
public class TeachersDaoImpl implements TeachersDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addTeacher(Teachers teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Teachers> getTeachers(Teachers teachers) {
		
		Session session = sessionFactory.getCurrentSession();
		
		
		
		return null;
	}

	@Override
	public Teachers getTeacher(String grade) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

	@Override
	public Teachers getTeacher(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return null;
	}

}
