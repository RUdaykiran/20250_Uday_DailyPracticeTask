package com.sonata;

public class Staff extends Employee{
	

	Staff(int empid,String ename,double sal,int leavesavailable)
	{
		super(empid,ename,sal,leavesavailable);
	}
	double calsal(double sal)
	{
		this.sal = sal;
		sal = sal + (0.18*sal);//calculates salary with 18%
		return sal;
	}
	public static void main(String args[])
	{
		Staff s=new Staff(01,"uday",500,10);
		System.out.print(s);
		
	}
	@Override
	public String toString() {
		return "staff [empid=" + sal + ", empname=" + leavesavailable + "]";
	}
}	
