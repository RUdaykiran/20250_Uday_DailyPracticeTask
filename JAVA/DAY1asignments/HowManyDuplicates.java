package com.sonata;

public class HowManyDuplicates {

	public static void main(String[] args) {
		int a[]= {1,1,1,2,2,3,3,4,5,5,6};//Initializing the array with values
		int max=0;//varable used to how many times the value is repeated 
		for(int i=1;i<a.length;i++)
		{
			int temp=0;//temporary variable
			for(int j=0;j<=i;j++)
			{
				
				if(a[i]==a[j])//for each value of i ,it compares with all the values in array
				{
					temp=temp+1;//varibles that function same as max variable
				}
			}
			if(temp>max)
			{
				max=temp;
			}
		}
		System.out.print(max);//prints how many times the value repeated

	}

}
