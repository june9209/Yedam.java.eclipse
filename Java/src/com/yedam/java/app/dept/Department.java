package com.yedam.java.app.dept;

public class Department {
	private int departmentId;
	private String departmentName;
	private String managerId;
	private int locationId;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String department) {
		this.departmentName = department;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", department=" + departmentName + ", managerId=" + managerId
				+ ", locationId=" + locationId + "]";
	}
}
