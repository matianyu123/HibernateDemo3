package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest3 {
	@Test
	public void quertTest3(){//通过参数名查询
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from Student where sname like :Vn");
		query.setString("Vn","%a%");
		List<Student> list=query.list();
		for(Student s:list){
			System.out.println(s);
		}
		tran.commit();
	}
}
