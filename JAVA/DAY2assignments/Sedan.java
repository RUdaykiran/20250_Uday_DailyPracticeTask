package InstanceAssignment;

public class Sedan extends Car{//child class of car
	int length;//Initializing variables or fields
	
	Sedan(){//default Constructor
		
	}
	Sedan(int speed, double regularPrice, String color,int length){
		//constructor that is used to assign values from main method
		super(speed,regularPrice,color);
		this.length = length;
	}
	
	public double getSalePrice() {//method that returns the price with variable discounts
		if(length>20) {
			return regularPrice*0.95;
		}
		else {
			return regularPrice*0.90;
		}
	}
	

}
