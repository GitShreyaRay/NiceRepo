package com.nice.entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserRoles implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UserRolesPk userRolesPk;
	private String userName;
	private String password;
	

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRolesPk getUserRolesPk() {
		return userRolesPk;
	}
	public void setUserRolesPk(UserRolesPk userRolesPk) {
		this.userRolesPk = userRolesPk;
	}
	
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "studentid") private Student student;
	 */
	
	@Override
	public String toString() {
		return "UserRoles [userRolesPk=" + userRolesPk + ", userName=" + userName + ", password=" + password + "]";
	}


}

