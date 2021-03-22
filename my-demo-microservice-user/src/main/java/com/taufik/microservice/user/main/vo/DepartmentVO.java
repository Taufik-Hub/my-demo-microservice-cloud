package com.taufik.microservice.user.main.vo;

public class DepartmentVO {

	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

	public DepartmentVO(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}

	public DepartmentVO() {
		super();
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	@Override
	public String toString() {
		return "DepartmentVo [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

}
