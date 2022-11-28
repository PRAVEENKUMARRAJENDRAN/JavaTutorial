package com.learning.collections;

import java.security.KeyStore.Entry;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key is string and value is int
		Map<String,Integer> hashmap = new HashMap<>();
		
		hashmap.put("A", 1);
		hashmap.put("B", 2);
		hashmap.put("C", 3);
		hashmap.put("D", 1);
		
		System.out.println("The size of hashmap is " +hashmap.size());
		System.out.println(hashmap);
		
		if(hashmap.containsKey("A")) {
			Integer A = hashmap.get("A");
			System.out.println("Value for the Key" + " \"A\" is: " + A);
		}
		
		for(String Key : hashmap.keySet()) {
			System.out.println("Key: " + Key + "Value: " + hashmap.get(Key));
		}
		
		for(java.util.Map.Entry<String, Integer> entry : hashmap.entrySet()) {
			System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue());
		}
		


	}

}
