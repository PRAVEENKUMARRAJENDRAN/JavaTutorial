package com.learning.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Need to read documentation 
		
		
		//Declaration of ArrayList
		//It is always a good practice to mention list instead of ArrayList
		List<Integer> arraylist = new ArrayList<Integer>(5);
		
		//Adding elements in the arraylist
		for(int i = 0; i < 5; i++) {
			arraylist.add(i);
		}
		
		System.out.println(arraylist);
		
		//Remove elements from the arraylist
		arraylist.remove(2);
		
		System.out.println(arraylist);
		
		for(int i =0 ; i < arraylist.size();i++) {
			
			System.out.print(arraylist.get(i) + " ");
			
		}
		
		
		

	}

}
