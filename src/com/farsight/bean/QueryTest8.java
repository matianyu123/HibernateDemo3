package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest8 {//∑÷“≥≤È—Ø
	@Test
	public void queryTest(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from Student order by id ");
		List<Student> list=query.setFirstResult(5).setMaxResults(3).list();
		for(Student s:list){
			System.out.println(s);
		}
		tran.commit();
	}

}
