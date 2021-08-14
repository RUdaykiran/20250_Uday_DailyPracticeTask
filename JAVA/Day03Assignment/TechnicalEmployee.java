package com.sonata;

public class TechnicalEmployee extends Employee {
	
	TechnicalEmployee(int empid, String ename, double sal, int leavesavailable) {
		super(empid, ename, sal, leavesavailable);
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
		TechnicalEmployee t1 = new TechnicalEmployee(100, "java", 1000.00,10);
		TechnicalEmployee t2 = new TechnicalEmployee(102, "python", 2000.00, 10);
		TechnicalEmployee t3 = new TechnicalEmployee(103, "c++", 3000.00, 10);
		
		
	}

	@Override
	double calsal(double sal) {//overrides calsal methods and calculates sal for 12%
		this.sal = sal;
		return sal+(sal*0.12);
	}

}
