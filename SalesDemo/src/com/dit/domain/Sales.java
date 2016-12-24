package com.dit.domain;

public class Sales {
	
	int data[] = {8, 19};
	
	public void salesRecords(){
		System.out.println("Sales records.....");
		System.out.println("Data");
		System.out.println("-------");
		
		for(int i = 0; i<data.length; i++){
			System.out.println((i+1)+"st value "+data[i]);
		}
	}
	
	
}
