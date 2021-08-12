package InstanceAssignment;

public class Truck extends Car{//child class of car
	int weight;//Initializing variables or fields
	
	Truck(){//default Constructor
		
	}
	Truck(int speed, double regularPrice, String color,int weight){
		//constructor that is used to assign values from main method
		super(speed,regularPrice,color);
		this.weight = weight;
	}
	
	
	public double getSalePrice() {//method that returns the price with variable discounts
		if(weight>2000) {
			return (regularPrice * 0.90);
		}
		else {
			return regularPrice*0.80;
		}
	}
	

}
