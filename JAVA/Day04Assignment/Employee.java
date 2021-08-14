package com.sonata;

public class Employee {
	int empId;
	String empname;
	double salary;
	
	public Employee(int empId,String empname,double salary) {
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", salary=" + salary + "]";
	}

}
