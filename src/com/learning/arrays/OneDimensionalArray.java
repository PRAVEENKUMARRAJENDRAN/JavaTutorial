package com.learning.arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		for(int i=0; i< arr.length; i++) {
			System.out.println("The one dimensional array values=" + arr[i]);
		}

	}

}
