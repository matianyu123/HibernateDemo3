package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest7 {
	@Test
	public void queryTest(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from Student s order by id desc");
		List<Student> list=query.list();
		for(Student aa:list){
			System.out.println(aa);
		}
	}
}
