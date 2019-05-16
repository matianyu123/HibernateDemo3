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
		teacher.setName("��ʦ1");
		
		Student stu1=new Student();
		stu1.setSname("ѧ��1");
		Student stu2=new Student();
		stu2.setSname("ѧ��2");
		
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
