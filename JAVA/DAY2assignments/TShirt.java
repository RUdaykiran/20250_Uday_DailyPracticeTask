package com.sonata;

public class TShirt {
	String color ;//color of T-Shirt
	String material; //Material of T-Shirt
	String design;//design of T-Shirt
	
	public void display(String color,String material,String design) {
		//method that displays properties of t shirt
		this.color = color;
		this.material = material;
		this.design = design;
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
		
	}
	

	public static void main(String[] args) {
		TShirt small = new TShirt();
		TShirt medium = new TShirt();
		TShirt large = new TShirt();//creating instances as small,medium,large
		
		small.display("red","nylon","checkshirt");
		medium.display("blue","silk","half sleeves");
		large.display("brown","cotton","full sleeves");//calling the display method
		
		

	}

}
