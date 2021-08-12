package com.sonata;

import java.lang.reflect.Array;

public class SumofValuesinArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};//Initializing an array
		int count = 0;//variable that is used to store the calculated value
		for(int i=0;i<=arr.length-1;i++){
			count = count + arr[i];
		}
		System.out.println(count);//prints the sum of all elements in the array

	}

}
