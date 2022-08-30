package com.TrainingProject___.BookMyTrip.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ADMINS",schema = "BOOK_MY_TRIP")
public class Admin {

	@Id
	@Column(name="ADMIN_ID")
	private Integer adminId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="ADMIN_NAME")
	private String adminName;

	public Admin() {
		super();
	}

	public Admin(Integer adminId, String password, String adminName) {
		super();
		this.adminId = adminId;
		this.password = password;
		this.adminName = adminName;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

