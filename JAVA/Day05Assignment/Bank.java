package com.sonata;

public class Bank {
	private int ID;
	private String name;
	public double accbal;
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getAccbal() {
		return accbal;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}
	
	@Override
	public String toString() {
		return "Bank [ID=" + ID + ", name=" + name + ", accbal=" + accbal + "]";
	}




	public void display() {
		System.out.println("Account ID : "+ID);
		System.out.println("Account Holder Name: "+name);
		System.out.println("Account Balance: "+accbal);
	}


	

}

