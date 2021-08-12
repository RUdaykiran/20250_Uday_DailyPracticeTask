package com.sonata;

public class Student {
	int stuid;
	String stuName;
	int stuclass;
	
	
	//getters and setters for student attributes
	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuclass() {
		return stuclass;
	}

	public void setStuclass(int stuclass) {
		this.stuclass = stuclass;
	}
	
	public void display() {//display method that prints the assigned values
		System.out.println(stuid);
		System.out.println("stuname");
		System.out.println(stuclass);
	}


	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setStuid(123);
		s1.setStuName("uday");
		s1.setStuclass(11);
		s2.setStuid(456);
		s2.setStuName("abc");
		s2.setStuclass(12);//setting values
		
		s1.display();
		s2.display();//calling display method

	}

}
