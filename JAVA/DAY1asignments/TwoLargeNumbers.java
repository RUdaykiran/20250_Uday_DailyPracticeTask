package com.sonata;

import java.util.Arrays;

public class TwoLargeNumbers {

	public static void main(String[] args) {
		int[] arr = {2,7,1,9,4,5,6};//Initializing the array with values
		Arrays.sort(arr);//Direct method to sort the array
		System.out.println(arr[arr.length-2] + " , " + arr[arr.length-1]);//printing the values using array index function

	}

}
