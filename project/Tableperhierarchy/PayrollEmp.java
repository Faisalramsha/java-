package com.faisal.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("payroll")
public class PayrollEmp extends Employee {
	
	private float fixed_salary;
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	public void setFixed_salary(float fixed_salary) {
		this.fixed_salary = fixed_salary;
	}
	private int increment;
	public float getFixed_salary() {
		return fixed_salary;
	}

}
