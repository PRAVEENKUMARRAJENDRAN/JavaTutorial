package com.learn.loop;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Whilecount = 10;
		int Docount = 10;
		int[] numbers = {1,2,3};
		
		//While Loop
		System.out.println("While Loop");
		while(Whilecount < 15) {
			System.out.println(Whilecount);
			Whilecount++;
		}
		
		//doWhile
		System.out.println("Do While Loop");
		do {
			System.out.println(Docount);
			Docount++;
		} while(Docount < 15);
		
		//forLoop
		System.out.println("For Loop");
		for(int i =0; i < 3; i++) {
			System.out.println(i);
		}
		
		//EnchancedforLoop
		System.out.println("Enchanced For loop");
		for(int j : numbers) {
			System.out.println(j);
		}

	}

}
