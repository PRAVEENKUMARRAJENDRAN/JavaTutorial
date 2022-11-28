package com.learning.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Read Documentation
		
		Set<String> hashset = new HashSet<>();
		
		//Hashset add will always return boolean to state whether the element is added or not..
		hashset.add("A");
		hashset.add("B");
		System.out.println("Insert result = " + hashset.add("C"));
		//returns false because already we have a C element 
		System.out.println("Insert result = " + hashset.add("C"));
		System.out.println(hashset);
		
		System.out.println("Whether the hashset has the C or not =" + hashset.contains("C"));
		
		
		hashset.removeAll(hashset);
		
		System.out.println(hashset);

	}

}
