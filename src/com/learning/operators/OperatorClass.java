package com.learning.operators;

public class OperatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arithemtic Operator
		int a = 1;
		int b = 2;
		int c = 3;
		boolean d = false;
		
		System.out.println("Addition=" + (a+b));
		System.out.println("Substraction=" + (a - b));
		System.out.println("Multiplication=" + (a*b));
		System.out.println("Division=" + (a/b));
		System.out.println("Modulo=" + (a%b));
		
		
		//Urnary operator
		a++;
		System.out.println("Post increment="+ a);
		++a;
		System.out.println("Post increment="+ a);
		//Pre incrment increments and assign it give 4
		System.out.println("Post increment="+ ++a);
		//Post incrment assign and increment  it give 4
		System.out.println("Post increment="+ a++);
		
		
		//Bitwise operator
		//5 = 0101 7 = 0111
		System.out.println("The & bitwise operator="+ (5&7));
		System.out.println("The | bitwise operator="+ (5|7));
		

	}

}
