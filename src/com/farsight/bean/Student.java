package com.farsight.bean;

public class Student {
	public Integer id;
	public String sname;
	public String sex;
	public Integer cid;
	public Teacher teacher;
	public Integer cust_id;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Student[id=" + id +",sname="+ sname +",sex=" + sex + ",cid=" + cid + "]";
	}
	public Student(){
		
	}
	public Student(Integer id ,String sname){
		this.id=id;
		this.sname=sname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	
}
