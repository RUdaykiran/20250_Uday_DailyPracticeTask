package com.sonata;

public class Employee1 {
	int empid;
	String name;
	double sal;//Initializing attributes
	public Employee1(int empid,String name,Double sal){//Employee constructor
		this.empid=empid;
		this.name=name;
		this.sal=sal;
	}
	public void display(){
		System.out.print(empid+" "+name+" "+sal);
	}
	public void salcal(double sal){
		this.sal = sal;
		System.out.println(sal*12);
	}
	
}
class Manager extends Employee1{//manager extends employee1 class(Inheritance)

	Manager(int empid, String name, Double empsal) {
		super(empid, name, empsal);//calls employee1 constructor
	}
	
	public void salcal(double sal){
		System.out.println(sal*12);
	}
}
class Developer extends Employee1{//developer extends employee1 class(Inheritance)

	Developer(int empid, String name, Double empsal) {
		super(empid, name, empsal);//calls employee1 constructor
	}
	
	public void salcal(double sal){
		System.out.println(sal*12);
	}
}
class Tester extends Employee1{//tester extends employee1 class(Inheritance)

	Tester(int empid, String name, Double empsal) {
		super(empid, name, empsal);//calls employee1 constructor
	}
	
	public void salcal(double sal){
		System.out.println(sal*12);
	}
	
	public static void main(String args[]){
		Employee1 e1 = new Employee1(100,"uday",1000.00);
		Employee1 e2 = new Employee1(20,"abc",2000.00);
		Tester t1 = new Tester(200,"xyz",3000.00);
		Manager m1 = new Manager(100,"uday",1000.00);
		Developer d1 = new Developer(500,"uday",90000.00);//calling the function
	}
}