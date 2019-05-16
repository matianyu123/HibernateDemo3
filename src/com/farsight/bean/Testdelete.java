package com.farsight.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class Testdelete {
	@Test
	public void testdeletes(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		Teacher teacher=session.get(Teacher.class,4);
		Student student=session.get(Student.class,18);
		teacher.getStudents().remove(student);
		tran.commit();
	}
}
