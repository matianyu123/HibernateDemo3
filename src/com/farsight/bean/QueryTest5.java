package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest5 {//����ͶӰ
	@Test
	public void queryTest5(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("select new Student(id,sname) from Student a");
		List<Student> list=query.list();
		for(Student a:list){
			System.out.println(a);
		}
		tran.commit();
	}
}
