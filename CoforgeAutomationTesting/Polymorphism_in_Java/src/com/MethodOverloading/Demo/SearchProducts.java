package com.MethodOverloading.Demo;

public class SearchProducts {
	
	public void search(String productname) {
		
		System.out.println("Searching by product name");
		
	}
	
	public void search(String productname, String brand) {
		
		
		System.out.println("Searching by product name and brand");
		
	}
	
	public void search(String productname, String brand, int price) {
		
		System.out.println("Searching by product name,brand and price");
		
	}
	

	public static void main(String[] args) {
		
		
		SearchProducts s = new SearchProducts();
		
		s.search("laptop");
		s.search("laptop","hp");
		s.search("laptop", "hp",100000000);
		

	}

}
