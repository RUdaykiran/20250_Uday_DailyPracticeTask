package com.sonata.streamAPI;

public class Product 
{
		private int id;
		private int price;
		private String name;
		
		
		public Product(int id, String name, int price) 
		{
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", price=" + price + ", name=" + name + "]";
		}
		
		
		
}
