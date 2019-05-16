package com.farsight.bean1;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class TestZuo {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		List<User> list=session.createQuery("from User u left join fetch  u.roles").list();
		Set<User> set=new HashSet<User>(list);
		for(User u:set){
			System.out.println(u.getUsername());
			Set<Role> role=u.getRoles();
			for(Role r:role){
				System.out.println("\t"+r.getRolename());
			}
		}
	}
}
