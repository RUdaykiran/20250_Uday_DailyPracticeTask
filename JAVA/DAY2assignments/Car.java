package InstanceAssignment;

public class Car {//Parent class
	int speed;
	double regularPrice;
	String color;//Initializing variables or fields
	
	Car(){//default Constructor
		
	}
	Car(int speed, double regularPrice, String color ){
		//constructor that is used to assign values from main method
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
		
	}
	
	public double getSalePrice() {//method that returns price of the car
		return regularPrice;
		
	}
	

}
