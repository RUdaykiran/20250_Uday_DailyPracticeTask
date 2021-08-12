package InstanceAssignment;

public class MyOwnAutoShop {

	public static void main(String[] args) {//main method
		Sedan s1 = new Sedan(100,20000.00,"Red",20);//assigning values by creating instances
		Ford f1 = new Ford(80,40000.00,"Blue",2000,10);
		Ford f2 = new Ford(70,60000.00,"Black",2001,10);
		Car c1 = new Car(100,30000.00,"Black");
		System.out.println("Sale price of sedan is : "+s1.getSalePrice());
		System.out.println("Sale price of ford is : "+f1.getSalePrice());
		System.out.println("Sale price of ford is : "+f2.getSalePrice());
		System.out.println("Sale price of car is : "+c1.getSalePrice());//printing the price of the car
		
		

	}

}
