package com.dit.domain;

public class MainTest {

	public static void main(String[] args) {
		Sales sale = new Sales();
		
		sale.salesRecords();
		display();
		
	}
	
	public static void display(){
		System.out.println("Display data from main...");
		System.out.println("-------------------------");
		System.out.println("Test 1...");
		System.out.println("Test 2...");
	}

}
