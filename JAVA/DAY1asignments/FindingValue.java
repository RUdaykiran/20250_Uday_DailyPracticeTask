package com.sonata;

public class FindingValue {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};//Initializing an array
		int a=2;
		for (int element : arr) {//enhanced for lopp
		    if (element == a) {//checks whether value is present or not
		        System.out.println(a +" is present in the array");
		    }
		}

	}

}
