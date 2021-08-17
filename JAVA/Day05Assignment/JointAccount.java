package com.sonata;

public class JointAccount extends Bank implements BankInterface{
	
	
	
	public void deposit(double cash) {
		accbal = accbal + cash;
		System.out.println("Bank deposited: "+ cash);
	}
	
	public void withdraw(double cash) {
		accbal = accbal -cash;
		System.out.println("withdrawn amount : "+ cash);
	}
	


	public static void main(String[] args) {
		JointAccount j1=new JointAccount();
		j1.setID(123);
		j1.setName("uday");
		j1.setAccbal(1000);
		
		j1.display();
		System.out.println();
		j1.deposit(1000);
		System.out.println();
		j1.display();
		System.out.println();
		j1.withdraw(1000);
		j1.display();
		
		System.out.println(j1);

	}

}