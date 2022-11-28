package com.learn.interfaces;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MountainBike m = new MountainBike(6, 0, 10);
		
		System.out.println("THe current gear is " + m.getGear());
		System.out.println("THe current brake is " + m.getBrake());
		System.out.println("THe current speed is " + m.getSpeed());
		
		
		
		m.applyBrake(5);
		
		System.out.println("THe current speed is " + m.getSpeed());
	}

}
