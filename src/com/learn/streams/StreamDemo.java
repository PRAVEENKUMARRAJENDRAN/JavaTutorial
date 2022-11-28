package com.learn.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arraylist = new ArrayList<>(); 
		
		arraylist.add(10);
		arraylist.add(20);
		
		//Without Streams
		for(int item : arraylist) {
			System.out.print(item + " ");
		}
		
		//Using Streams
		List<Integer> squarelist = arraylist.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println("The squared numbers: " + squarelist);
		
		//Removes Duplicate
		Set<Integer> squareSet = arraylist.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println("The squared numbers: " + squareSet);
		
		//Filter
		List<String> languages = new ArrayList<>();
		languages.add("Javascript");
		languages.add("Scala");
		languages.add("Basic");
		languages.add("Java");
		languages.add("Python");
		
		List<String> noStreamList = new ArrayList<>();
		
		for(String s : languages) {
			if(s.startsWith("J")) {
				
				noStreamList.add(s);
				
			}
		}
		
		System.out.println("The String that start with J are: " + noStreamList);
		
		
		//Using Streams 
		List<String> streamList = languages.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
		System.out.println("The String that start with J using Stream are: " + streamList);
		
		
		//Sort
		List<String> sortList = languages.stream().sorted().collect(Collectors.toList());
		System.out.println("The sorted alaphatic " + sortList);
		
		//forEach
		System.out.println("Printing the element using Foreach: ");
		sortList.stream().forEach(y -> { 
			System.out.println("The element is: " + y );
		});
		
		//Reduce 
		List<Integer> numberlist = new ArrayList<>();
		numberlist.add(10);
		numberlist.add(20);
		int sum = numberlist.stream().reduce(0,(ans,i)->ans+i);
		
		System.out.println("Sum of all the elements " + sum);

		

	}

}
