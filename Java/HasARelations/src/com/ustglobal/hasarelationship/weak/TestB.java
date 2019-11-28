package com.ustglobal.hasarelationship.weak;

public class TestB {
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.name);
		c.sound();
		c.drive();
		c.m.play();
		System.out.println(c.m.sname);
	}

}
