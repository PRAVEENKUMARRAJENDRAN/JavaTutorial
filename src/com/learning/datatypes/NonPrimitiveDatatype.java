package com.learning.datatypes;

public class NonPrimitiveDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//One Way
		String s = "Praveen";
		//Another Way of creating a String
		String newS = new String("Praveen New ");
		
		System.out.println("One Way= " + s);
		System.out.println("Another Way= " + newS);
		
		// One way dec and init
		int a[];
		a = new int[2];
		
		//Another way
		String[] b = new String[3];
		
		a[0] = 1;
		
		b[0] = "Me again Praveen";
		
		System.out.println("Integer Array a= " + a[0]);
		//Returns 0 value since it doesn't have any value at that index
		System.out.println("Integer Array a= " + a[1]);
		
		
		System.out.println("String Array a= " + b[0]);
		//Returns null value since it doesn't have any value at that index
		System.out.println("String Array b= " + b[1]);
		
		//Returns the Memory location
		System.out.println("String Array  aMemory= " + a);	
		System.out.println("String Array bMemory= " + b);
		
		

	}

}
