package com.sonata;

import java.util.*;
public class UserEmployee
{
	public static int compareTo(Employee e,Employee e1)
	{
		if(e.empId==e1.empId) 
		{	
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public void calyearlysal(ArrayList<Employee>s2)
	{
		for(Employee a1:s2)
		{
			EmployeeImpl A=new EmployeeImpl();
			double annualsal = (a1.salary)*12;
			System.out.println("Annual Salary of Employee is :" + annualsal);
			
		}
	}
	public static void main(String args[]) throws MyownException
	{
		UserEmployee u1=new UserEmployee();
		Employee e1=new Employee(101,"uday",5000.00);
		Employee e2=new Employee(102,"abc",6000.00);
		Employee e3=new Employee(103,"xyz",10000.00);
		
		ArrayList<Employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		System.out.println(l1);
		for(Employee a1:l1)
		{
			if(a1.salary<=5000)
			{
				a1.salary=10000;
			}
		}
		u1.calyearlysal(l1);
		System.out.println(l1);
		for(Employee a1:l1)
		{
			for(Employee a2:l1)
			{
				if(a1==a2)
				{
					continue;
				}
				else if(compareTo(a1,a2)==0)
				{
					throw new MyownException("Duplicate Employee");
				}
			}
		}
	}
}

