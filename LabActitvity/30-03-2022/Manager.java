package com.faisal;

public class Manager extends Employee{
	public Manager(long id,String name,String address,long phone,double salary) {
		super(id,name,address,phone);
		this.employeeid = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}


}
