package com.sonata;

public class HighestNumber {

	public static void main(String[] args) {
		int a =12;
		int b =25;
		int c =89;//given values
		if(a>b && a>c){//executes if loop only when a is highest
			System.out.println("Highest Number is :"+ a);
		}
		else if(b>a && b>c){//executes if loop only when b is highest
			System.out.println("Highest Number is :"+ b);
		}
		else{//executes if loop only when c is highest
			System.out.println("Highest Number is :"+ c);
		}

	}

}
