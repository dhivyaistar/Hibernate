package com.istar.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseDAO
{
	private static SessionFactory sessionFactory;


	public static Session createSession()
	{
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
	 public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	
}