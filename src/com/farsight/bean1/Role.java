package com.farsight.bean1;

import java.util.HashSet;
import java.util.Set;

public class Role {
	public Integer id;
	public String rolename;
	public Set<User> users = new HashSet<User>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
}
