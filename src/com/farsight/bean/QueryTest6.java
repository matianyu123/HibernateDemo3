package com.farsight.bean;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class QueryTest6 {//使用投影获取莫吉列的值
	@Test
	public void queryTest(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("select id, sname from Student s");
		List<Object[]> list=query.list();
		for(int i=0;i<list.size();i++){
			Object[] obj=list.get(i);
			System.out.println(obj[0]+":"+obj[1]);
		}
		tran.commit();
	}
}
