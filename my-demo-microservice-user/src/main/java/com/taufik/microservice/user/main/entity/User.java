package com.taufik.microservice.user.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private Long departmentId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String userFirstName, String userLastName, String userEmail, Long departmentId) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.departmentId = departmentId;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", departmentId=" + departmentId + "]";
	}

}
