package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest2 {//通过占位符
	@Test
	public void queryTest2(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from Student where sname like ?");
		query.setString(0,"%m%");
		List<Student> list=query.list();
		for(Student s:list){
			System.out.println(s);
		}
		tran.commit();
	}
}
