package com.learn.abstraction;

public abstract class GraphicClass {
	
	int x;
	int y;
	
	public GraphicClass() {
		System.out.println("The Graphic class constructor");
	}
	
	public void toMove(int x, int y) {
		System.out.println("The x position is " + x + " y position is " + y );
	}
	
	abstract void draw();
	abstract void resize();

}
