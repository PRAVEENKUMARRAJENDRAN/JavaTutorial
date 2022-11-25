package com.learning.controlstatements;

public class Switch {
	
	public static void main(String[] args) {
		int month = 2;
		String monthString;
		
		switch(month) {
		case 1:
			monthString = "Jan";
			break;
		case 2:
			monthString = "Feb";
			break;
		case 3:
			monthString = "Mar";
			break;
		case 4:
			monthString = "Apr";
			break;
		case 5:
			monthString = "Jun";
			break;
		case 6:
			monthString = "Jul";
			break;
		default:
			monthString = "Invalid month";
			break;
		}
		
		System.out.println("The month is " + monthString);
	}

}
