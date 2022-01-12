package com.yedam.java.emp13db_conn;

public class Department {
	private int employee_id;
	private String first_name;
	private String job_id;
	private int salary;
	private String commission_pct;
	private String department_name;
	private int location_id;
	
	
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(String commission_pct) {
		this.commission_pct = commission_pct;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	@Override
	public String toString() {
		return "Department [employee_id=" + employee_id + ", first_name=" + first_name + ", job_id=" + job_id
				+ ", salary=" + salary + ", commission_pct=" + commission_pct + ", department_name=" + department_name
				+ ", location_id=" + location_id + "]";
	}
	
	
	
	
	
}
