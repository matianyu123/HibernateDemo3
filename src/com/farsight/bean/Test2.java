package com.farsight.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class Test2 {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran =session.beginTransaction();
		tran.begin();
		Teacher teacher=new Teacher();
		teacher.setName("小明1");
		
		Student stu=new Student();
		stu.setSname("小路1");
		Student stu1=new Student();
		stu1.setSname("小名1");
		
		teacher.getStudents().add(stu);
		teacher.getStudents().add(stu1);
		
		stu.setTeacher(teacher);
		stu.setTeacher(teacher);
		
		session.save(stu);
		tran.commit();
	}
}
