package com.sonata;

public class SavingsAccount extends Bank implements BankInterface{
	public void deposit(double cash) {
		accbal = accbal + cash;
		System.out.println("Bank deposited: "+ cash);
	}
	
	public void withdraw(double cash) {
		accbal = accbal - cash;
		System.out.println("withdrawn amount : "+ cash);
		}

	
	public static void main(String[] args) {
		SavingsAccount s1=new SavingsAccount();
		s1.setID(456);
		s1.setName("uday");
		s1.setAccbal(1000);
		s1.display();
		s1.deposit(1000);
		s1.display();
		s1.withdraw(1000);
		s1.display();
		System.out.println(s1);

	}

}

