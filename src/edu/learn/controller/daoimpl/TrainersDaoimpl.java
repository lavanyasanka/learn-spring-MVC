package edu.learn.controller.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import edu.learn.rest.RestfulWebservices.Dao.SessionUtil;
import edu.learn.rest.RestfulWebservices.Dao.TrainersDao;
import edu.learn.rest.RestfulWebservices.model.Trainers;

public class TrainersDaoimpl implements TrainersDao{

	@Override
	public List<Trainers> getallTrainers() throws Exception {

		Session session = null;
		session = SessionUtil.createSessionFactory().openSession();
		Transaction tx = null;
		tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Trainers.class);
		@SuppressWarnings("unchecked")
		List<Trainers> trainers = cr.list();
		tx.commit();
		session.close();
		return trainers;

	}
}

