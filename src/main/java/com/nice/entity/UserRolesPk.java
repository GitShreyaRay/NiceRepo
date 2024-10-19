package com.nice.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserRolesPk implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long roleId;
	private Long userId;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
