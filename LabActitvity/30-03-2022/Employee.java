package com.faisal;

public class Employee {
	public long employeeid;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance;
	public double Hra;
	

	
	public Employee(long id,String name,String address,long phone) {
		this.employeeid = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Salary is:" +salary);
	}
	
	
	
}