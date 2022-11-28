package com.learning.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read Documentation
		
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("A");
		linkedlist.add("B");
		linkedlist.addLast("C");
		linkedlist.add(2,"E");
		linkedlist.addFirst("A1");
		
		System.out.println(linkedlist);
		
		linkedlist.remove("A");
		linkedlist.remove(0);
		linkedlist.removeLast();
		
		System.out.println(linkedlist);

	}

}
