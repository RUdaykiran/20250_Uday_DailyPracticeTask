package com.sonata;

public class Shape {
	double length;
	double height;
	double width;//Initializing attributes
	Shape(double length,double height,double width){
		this.length=length;
		this.height=height;
		this.width=width;
	}
	
	public double area(double length,double height,double width){
		return length*height*width;
	}
	

}
	class Triangle extends Shape{
		Triangle(double length,double height,double width){
			super(length,height,width);//calls shape constructor
		}
		public double area(double length,double height,double width){
			double area;
			area = (length * width)/2;//formula to calculate triangle area
			return area;
		}
	}
	class Square extends Shape{
		Square(double length,double height,double width){
			super(length,height,width);//calls shape constructor
		}
		public double area(double length,double height,double width){
			double area;
			area = length * length;//formula to calculate square area
			return area;
		}
	}
	class Rectangle extends Shape{
		Rectangle(double length,double height,double width){
			super(length,height,width);//calls shape constructor
		}
		public double area(double length,double height,double width){
			double area;
			area = (length * width);//formula to calculate rectangle area
			return area;
		}
	
		public static void main(String[] args) {
			Shape s1 = new Shape(10.3,2.3,0.1);
			Rectangle r1 = new Rectangle(6.0,3.0,7.5);
			Square q1 = new Square(1.3,2.3,4.4);
			Triangle t1=new Triangle(2.5,3.5,4.5);
			
			
			
		}
}