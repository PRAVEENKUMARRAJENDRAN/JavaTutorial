package com.learn.encapsulation;

public class Student {
	
	
	private String name;
	private int age;
	private String address;
	
	//Constructor initialize all the properties of the class
	public Student(String name,int age, String address) {
		
		this.name = name;
		this.age = age;
		this.address = address;
				
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	private void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	private String getAddress() {
		return address;
	}
	
	public String studentDetails() {
		return ("The student name is " + getName() + ". His age is " + getAge() + " lives in "
				+ getAddress());
	}

}
