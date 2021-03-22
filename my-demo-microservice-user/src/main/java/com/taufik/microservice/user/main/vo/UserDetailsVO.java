package com.taufik.microservice.user.main.vo;

public class UserDetailsVO {

	private Long userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private DepartmentVO department;

	public UserDetailsVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetailsVO(Long userId, String userFirstName, String userLastName, String userEmail,
			DepartmentVO department) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.department = department;
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

	public DepartmentVO getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "UserDetailsVO [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", department=" + department + "]";
	}

}
