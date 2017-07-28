package edu.learn.controller.dao;

import edu.learn.controller.model.Login;
import edu.learn.controller.model.Student;

public interface StudentDao {
	
	  public void register(Student student);
	  public  Student validateStudent(Login login);
}
