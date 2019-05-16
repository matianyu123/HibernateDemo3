package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest1 {
	@Test
	public void queryTest1(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from Student");
		List<Student> list=query.list();
		for(Student s:list){
			System.out.println(s);
		}
		tran.commit();
		
	}
}
