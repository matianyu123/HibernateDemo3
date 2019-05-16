package com.farsight.bean1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class TestPoQie {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		List<Role> list=session.createQuery("from Role r inner join fetch r.users").list();
		HashSet<Role> setList=new HashSet<Role>(list);
		for(Role r:setList){
			System.out.println(r.getRolename());
			Set<User> set=r.getUsers();
			for(User aa:set){
				System.out.println("\t"+aa.getUsername());
			}
		}
		tran.commit();
	}
}
