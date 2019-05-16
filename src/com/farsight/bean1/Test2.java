package com.farsight.bean1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;



public class Test2 {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Criteria cri=session.createCriteria(User.class);
		List<User> list=cri.list();
		for(User s:list){
			System.out.println(s);
		}
		tran.commit();
	}
}
