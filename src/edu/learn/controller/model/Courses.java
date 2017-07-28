package edu.learn.controller.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_id;
	@Column
	private String coursename;
	@Column
	private int duration;
//	@ManyToMany(mappedBy="courses",cascade=CascadeType.ALL)
//	private List<Students> students;

	//getters and setters
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
/*	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}*/


	//constructors
	public Courses(int course_id) {
		super();
		this.course_id = course_id;
	}
	public Courses() {
		super();
	}
	

}



