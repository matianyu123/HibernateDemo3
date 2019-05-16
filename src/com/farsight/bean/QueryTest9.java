package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest9 {
	@Test
	public void queryTest(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("select count(s) from Student s");
		List<Number> list = query.list();
		Long countValue = list.get(0).longValue();
		System.out.println(countValue);
		tran.commit();
	}
}
