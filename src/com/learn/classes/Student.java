package com.learn.classes;

public class Student {
	
	String name;
	int age;
	String address;
	
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
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String studentDetails() {
		return ("The student name is " + getName() + ". His age is " + getAge() + " lives in "
				+ getAddress());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Praveen = new Student("Praveen",24,"xyz address");
		
		System.out.println(Praveen.studentDetails());
		
		

	}

}
