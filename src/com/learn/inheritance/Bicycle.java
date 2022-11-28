package com.learn.inheritance;

public class Bicycle {
	
	protected int gear;
	protected int brake;
	protected int speed = 10;
	
	
	
	//Base class constructor
	public Bicycle(int StartGear, int StartBrake) {
		this.gear = StartGear;
		this.brake  = StartBrake;
	}
	
	public void setGear(int StartGear) {
		
		gear = StartGear;
		
	}
	
	public void setBrake(int StartBrake) {
		
		brake = StartBrake;
		
	}
	
	public void applyBrake(int value) {
		speed -= value;
	}
	
	public void applyGear(int value) {
		speed += value;
	}

}
