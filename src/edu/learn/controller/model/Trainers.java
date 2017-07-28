package edu.learn.controller.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Trainers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int trainer_id;
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private int num_experience;

/*	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Courses> courses;
	@ManyToMany
	private Collection<Students> students;*/
	
	
	//getters and setters
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getNum_experience() {
		return num_experience;
	}
	public void setNum_experience(int num_experience) {
		this.num_experience = num_experience;
	}
/*	public Collection<Courses> getCourses() {
		return courses;
	}
	public void setCourses(Collection<Courses> courses) {
		this.courses = courses;
	}
	public Collection<Students> getStudents() {
		return students;
	}
	public void setStudents(Collection<Students> students) {
		this.students = students;
	}*/
	
	//constructors
	public Trainers(int trainer_id) {
		super();
		this.trainer_id = trainer_id;
	}
	public Trainers() {
		super();
	}
	
	
}
