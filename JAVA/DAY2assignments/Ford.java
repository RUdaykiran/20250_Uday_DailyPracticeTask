package InstanceAssignment;

public class Ford extends Car{//child class of car
	int year;
	int manufacturerDiscount;//Initializing variables or fields
	
	Ford(){//default Constructor
		
	}
	Ford(int speed, double regularPrice, String color,int year,int manufacturerDiscount){
		//constructor that is used to assign values from main method
		super(speed,regularPrice,color);
		this.year = year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	
	public double getSalePrice() {//returns the sale price of the car
		return (regularPrice-manufacturerDiscount);
	}

}
