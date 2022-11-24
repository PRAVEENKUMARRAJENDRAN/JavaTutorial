package com.learning.dataconversion;

public class ExplicitDataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Explicitdata conversion is like using type casting one, where
		 * we can perform large range datatype to fit in the smaller one*/
		
		double a = 50.50;
		System.out.println("Double representation a=" + a);
		
		float b = (float)a;
		System.out.println("Float representation b=" + b);
		
		int c = (int)b;
		System.out.println("Int representation c=" + c);

	}

}
