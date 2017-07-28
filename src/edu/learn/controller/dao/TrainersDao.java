package edu.learn.controller.dao;

import java.util.List;

import edu.learn.rest.RestfulWebservices.model.Trainers;

public interface TrainersDao {

	public List<Trainers> getallTrainers() throws Exception;
}
