package com.kids.creatives.dao;

import java.util.List;

import com.kids.creatives.entities.Teachers;

public interface TeachersDao {
	
	public void addTeacher(Teachers teacher);
	public List<Teachers> getTeachers(Teachers teachers);
	public Teachers getTeacher(String grade);
	public Teachers getTeacher(int id);
}
