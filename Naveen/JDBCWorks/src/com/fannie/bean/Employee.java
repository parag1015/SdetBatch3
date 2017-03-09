package com.fannie.bean;

public class Employee {
	private int empId;
	private String empName;
	private double empSal;
	private String empEmail;
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empEmail=" + empEmail
				+ "]";
	}

	// default constructor 
	public Employee(){}

	// parametric constructor 
	public Employee(int empId, String empName, double empSal, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
	}
	public Employee(String empName, double empSal, String empEmail) {
		this.empName = empName;
		this.empSal = empSal;
		this.empEmail = empEmail;
	}

	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	
}