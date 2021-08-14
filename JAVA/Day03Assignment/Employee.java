package com.sonata;

public abstract class Employee {
	int empid;
    String ename;
	double sal;
	int leavesavailable;//Initializing attributes
	abstract double calsal(double basicpay);
	Employee(int empid,String ename,double sal,int leavesavailable){//employee constructor 
		this.empid=empid;
		this.ename=ename;
		this.sal=sal;
		this.leavesavailable=leavesavailable;
	}
	@Override
	public String toString() {//overriding toString method
		return "Employeeabstract [empid=" + sal + ", leavesavailable=" + ename + "]";
	}
	
	
}



