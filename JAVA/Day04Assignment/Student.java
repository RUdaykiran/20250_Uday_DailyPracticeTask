package com.sonata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	int stdId;
	String name;
	double marks;
	public Student(int stdid,String name,double marks)
	{
		this.stdId=stdid;
		this.name=name;
		this.marks=marks;
	}
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String args[])
	{
		List<Student> s1=new ArrayList<Student>();
		s1.add(new Student(101,"uday",200));
		s1.add(new Student(102,"xyz",300));
		s1.add(new Student(103,"abc",100));
		
		for(Student a1:s1) {
			System.out.println(a1);
			
		}
	}

}

