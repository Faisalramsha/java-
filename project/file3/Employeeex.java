package com.faisal;

import java.sql.Date;

import javax.persistence.*;

@Table (name="employeeex")
@Entity
public class Employeeex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String ename;
  private float salary;
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Date getDate_joining() {
	return date_joining;
}
public void setDate_joining(Date date_joining) {
	this.date_joining = date_joining;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
private Date date_joining;
  private long phone;
}
