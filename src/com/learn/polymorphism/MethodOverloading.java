package com.learn.polymorphism;

public class MethodOverloading {
	
	public void shape(int x,int y) {
		
		int shape1 = x * y;
		System.out.println("The Square root is " + shape1);
	}
	
	public void shape(int x,int y,int z) {
		
		int shape1 = x * y * z;
		System.out.println("The Square root is " + shape1);
	}
	
	public double shape(double x,double y,double z) {
		
		double shape1 = x * y * z;
		System.out.println("The Square root is " + shape1);
		
		return shape1;
	}

}
