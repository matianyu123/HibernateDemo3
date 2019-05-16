package com.farsight.bean1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Configuration config;
	public static SessionFactory factory;
	static{
		config=new Configuration();
		config.configure();
		factory=config.buildSessionFactory();
	}
	public static Session getCurrentSession(){
		return factory.getCurrentSession();
	}
}
