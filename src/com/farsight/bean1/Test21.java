package com.farsight.bean1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.junit.Test;

public class Test21 {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Criteria cri=session.createCriteria(User.class);
		cri.addOrder(Order.desc("id"));
		List<User> list=cri.list();
		for(User s:list){
			System.out.println(s);
		}
		tran.commit();
	}
}
