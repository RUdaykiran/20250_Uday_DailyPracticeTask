package com.sonata;

public class DuplicateValues {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,3,4,5,5,2,3};//Initializing the values in the array
		for(int i=1;i<a.length;i++)
		{
			int temp=0;
			for(int j=0;j<=i;j++)
			{
				if(a[i]==a[j])
				{
					temp=temp+1;
				}
			}
			if(temp==2)//executes if loop only when there are duplicates
			{
				System.out.print(a[i]+" ");//prints the repeated value
			}
		}
	}

}
