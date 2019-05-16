package com.farsight.bean1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class Tests {
	@Test
	public void test1(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		User u1=new User();
		u1.setUsername("小明");
		User u2=new User();
		u2.setUsername("小心");
		
		Role r1=new Role();
		r1.setRolename("产品经理");
		Role r2=new Role();
		r2.setRolename("程序员");
		
		u1.getRoles().add(r1);
		r1.getUsers().add(u1);
		
		u1.getRoles().add(r2);
		r2.getUsers().add(u1);
		
		u2.getRoles().add(r1);
		r1.getUsers().add(u2);
		
		
		session.save(u1);
		session.save(u2);
		session.save(r1);
		session.save(r2);
		tran.commit();
	}
}
