package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest4 {
	@Test
	public void  quertTest4(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("select c from Student c where id>? ");
		query.setInteger(0, 3);
		List<Student> list=query.list();
		for(Student s:list){
			System.out.println(s);
		}
		tran.commit();
	}
}	
