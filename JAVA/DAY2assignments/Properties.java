package com.sonata;

public class Properties {
	int proId;
	String proName;
	int proPrice;
	int gst;
	
	
	//getters and setters for proId,proName,proPrice
	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
	public void display(int price,int GST) {//display method that calculates the price after adding gst and prints it
		this.proPrice = price;
		this.gst = GST;
		GST = (price*GST)/100;
		System.out.println(proPrice + GST);
		System.out.println(proId);
		System.out.println(proName);
	}



	public static void main(String[] args) {
		Properties p1 = new Properties();
		p1.setProId(01);//setting id
		p1.setProName("MACHINE");//setting String value
		p1.setProPrice(10000);//setting price
		p1.display(10000,18);//taking gst as 18% and price as 10000
		

	}

}
