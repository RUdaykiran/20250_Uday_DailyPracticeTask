package com.sonata.streamAPI;

import java.util.List;

import java.util.stream.Collectors;
public class OneProduct 
{
	public static void main(String[] args) 
	{

		
		List<Product> p=Runner.getproduct();
		
		Product p3=p.stream().max((product1,product2)->product1.getPrice()>product2.getPrice() ? 1:-1).get();
		System.out.println("Max price is "+p3);
		List < Product >p1 = p.stream()
	            .sorted((o1, o2) -> (int)(o1.getPrice() - o2.getPrice())).collect(Collectors.toList());
	        System.out.println(p1);
	     List < Product >p2 = p.stream()
		            .sorted((o1, o2) -> (int)(o2.getPrice() - o1.getPrice())).collect(Collectors.toList());
	     System.out.println(p2);
	        
	}
}
