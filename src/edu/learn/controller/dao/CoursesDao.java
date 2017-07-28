package edu.learn.controller.dao;

import java.util.List;

import edu.learn.controller.model.Courses;

public interface CoursesDao {
	
	public List<Courses> getAllCourses() throws Exception;
}
