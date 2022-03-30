package com.faisal;

public class InheritanceActitvity {
	public static void main(String[] args) { 
		Manager n =new Manager(1234,"Peter","Patna-Bihar",23112,55000);
		n.calculateSalary();
		
		Trainee t = new Trainee(2132,"Alex","LA-USA",32331,76000);
		t.calculateSalary();
	}
	

}
