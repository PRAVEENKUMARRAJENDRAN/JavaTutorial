package com.learning.controlstatements;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int testscore = 90;
		char grade;
		
		if(testscore >= 91) {
			grade = 'A';
		}
		else if(testscore >= 81) {
			grade = 'B';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Grade = " + grade);

	}

}
