package com.farsight.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;


public class Test1 {
	@Test
	public void tests(){
		Session session=HibernateUtil.getCurrentSession();
		Transaction tran=session.beginTransaction();
		tran.begin();
		Teacher teacher=new Teacher();
		teacher.setName("老师1");
		
		Student stu1=new Student();
		stu1.setSname("学生1");
		Student stu2=new Student();
		stu2.setSname("学生2");
		
		teacher.getStudents().add(stu1);
		teacher.getStudents().add(stu2);
		
		stu1.setTeacher(teacher);
		stu2.setTeacher(teacher);
		
		session.save(stu1);
		session.save(stu2);
		session.save(teacher);
		tran.commit();
	}
}
