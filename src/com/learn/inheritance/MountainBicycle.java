package com.learn.inheritance;

public class MountainBicycle extends Bicycle {
	
	public int height;

	
	public MountainBicycle(int StartGear, int StartBrake, int Height) {
		//This super method initailze the base class object
		super(StartGear, StartBrake);
		// TODO Auto-generated constructor stub
		this.height = Height;
	}
	
	public void setHeight(int Height) {
		height = Height;
	}

}
