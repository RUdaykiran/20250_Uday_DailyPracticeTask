package com.sonata;

public class CustomException{
    int sal;//Initializing attributes
		public class salaryexception  extends Exception{//extends exception class
			salaryexception(String s1){
				super(s1);//calling constructor using super keyword
			}
		}

		public void salary(int salary) throws salaryexception{//if condition not satisfied it throws exception
			if(salary<100000){
				throw new salaryexception ("salary shouldn't be less than 100000");
			}
			else{
				System.out.println("Salary is : "+salary);
			}
		}
		public static void main(String[] args) throws salaryexception{
			CustomException c1=new CustomException();
		    c1.sal=50000;
			c1.salary(c1.sal);

		}

}