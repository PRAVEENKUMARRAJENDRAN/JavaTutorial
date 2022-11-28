package com.learn.encapsulation;

import com.learn.encapsulation.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student Praveen = new Student("Praveen",24,"xyz address");
		
		System.out.println(Praveen.studentDetails());
		//Praveen.setAddress("s"); gives error because it is private
		
		//System.out.println(Praveen.); gives error because it is private
		

	}

}
