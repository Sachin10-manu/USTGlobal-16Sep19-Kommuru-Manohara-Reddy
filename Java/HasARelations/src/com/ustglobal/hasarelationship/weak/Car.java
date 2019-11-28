package com.ustglobal.hasarelationship.weak;

public class Car {
	String name;
	
	Music m = new Music();
	
	void sound() {
		System.out.println("sound() method");
	}
	
	void drive() {
		System.out.println("drive() method");
	}
}
