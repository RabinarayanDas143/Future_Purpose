package com.example.Hibernate;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.java8Features.StreamApi.EmploeeModel;

public class HibernateConfiguration {
	public static void main(String[] args) {
		EmploeeModel emp = new EmploeeModel(1, "Rabi", 25, 10000);
		// hibernat.cfg.xml this file contain all the configuaration of database
		// conncetion
		//Configuration config = new Configuration("hibernat.cfg.xml");

		//SessionFactory sessionFactory = config.buildSessionFactory();
		// SessionFactory object is used to create open and maintain session of lifecycle .
		//Session session = sessionFactory.openSession();
		//Transaction tx = session.beginTransaction();
		//session.save(emp);
		//tx.commit();
	}
}
