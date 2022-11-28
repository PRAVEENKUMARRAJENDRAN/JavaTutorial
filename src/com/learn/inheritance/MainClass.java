package com.learn.inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MountainBicycle m = new MountainBicycle(6, 0, 1);
		
		System.out.println("THe current gear is " + m.gear);
		System.out.println("THe current brake is " + m.brake);
		System.out.println("THe current height is " + m.height);
		
		System.out.println("THe current speed is " + m.speed);
		
		m.applyBrake(5);
		
		System.out.println("THe current speed is " + m.speed);
	}

}
