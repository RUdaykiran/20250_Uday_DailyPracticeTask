package com.sonata;

import java.util.ArrayList;

public class EmployeeImpl implements EmployeeInt {

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double yearSalary(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double appSalary(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	ArrayList<Employee> l1=new ArrayList<>();
	
	public void addemp(Employee o) {
		l1.add(o);
	}
	public ArrayList<Employee> getemp(){
		return l1;
	}

}
