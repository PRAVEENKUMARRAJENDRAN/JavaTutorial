package com.learning.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Read Documentation
		
		Stack<String> country = new Stack<>();
		
		country.push("America");
		country.push("New Zealand");
		country.push("India");
		
		System.out.println(country);
		
		System.out.println("The Top element is " + country.peek());
		
		country.pop();
		
		System.out.println(country);
		
		
		
		

	}

}
