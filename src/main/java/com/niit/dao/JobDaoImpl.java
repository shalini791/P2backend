package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.model.Job;
import com.niit.model.User;
@Repository
@Transactional
public class JobDaoImpl implements JobDao {
@Autowired
private SessionFactory sessionFactory;
public void saveJob(Job job) {
		Session session=sessionFactory.getCurrentSession();
		session.save(job);
	}

}
