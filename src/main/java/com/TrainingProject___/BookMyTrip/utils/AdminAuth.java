package com.TrainingProject___.BookMyTrip.utils;


import org.springframework.stereotype.Component;

@Component
public class AdminAuth {

	private Integer adminId;
	private String password;

	public AdminAuth() {
		super();
		
	}

	public AdminAuth(Integer adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

