package com.sonata.streamAPI;

import java.util.ArrayList;
import java.util.List;
public class Runner 
{
	public static List<Product> getproduct(){
		List<Product> list=new ArrayList();
		list.add(new Product(01,"mobile",1000));
		list.add(new Product(02,"machine",1000));
		list.add(new Product(03,"nokia",1000));
		return list;
	}
}

