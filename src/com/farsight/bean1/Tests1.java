package com.farsight.bean1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class Tests1 {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Role role=session.get(Role.class,12);
		session.delete(role);
		tran.commit();
	}
}
