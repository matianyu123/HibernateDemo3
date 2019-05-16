package com.farsight.bean1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class Test31 {
	@Test
	public void tets(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		List<Object[]> list = session.createQuery("from User u inner join u.roles").list();
		for(Object[] o:list){
			User u=(User)o[0];
			Role r=(Role)o[1];
			System.out.println(u.getUsername()+":"+r.getRolename());
		}
		tran.commit();

	}
}
