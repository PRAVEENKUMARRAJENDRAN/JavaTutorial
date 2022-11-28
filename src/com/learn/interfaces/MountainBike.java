package com.learn.interfaces;

public class MountainBike implements Bicycle {
      private int gear;
      private int speed;
      private int brake;
      
      
    public MountainBike(int gear,int brake, int speed){
    	
    	this.gear = gear;
    	this.brake = brake;
    	this.speed = speed;
    	
    	
    }
    
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
		
	}
	public int getGear() {
		return gear;
	}
	public int getBrake() {
		return brake;
	}

	public void setBrake(int brake) {
		this.brake = brake;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed + increment;
		
	}
      
      
}
