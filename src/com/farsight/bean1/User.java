package com.farsight.bean1;

import java.util.HashSet;
import java.util.Set;

public class User {
	public Integer id;
	public String username;
	public String password;
	public Set<Role> roles = new  HashSet<Role>();
	@Override
	public String toString() {
		return "User=[user="+username+"]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
