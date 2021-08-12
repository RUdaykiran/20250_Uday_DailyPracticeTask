package com.sonata;

import java.lang.reflect.Array;
import java.lang.String;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};//Initializing the array with values
		int length = arr.length; //calculates the length of arr and stores in length variable
		int[] arr1 = new int[length];//Initializing another array with same length as arr
		for(int i=length-1;i>=0;i--){//loop from end to begining
			arr1[i] = i;//assiging values from arr to arr1
		}
		for(int i=length-1;i>=0;i--){
			System.out.print(arr[i] + " ");//prints the reversed array
		}

	}

}
