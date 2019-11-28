package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		
		Car c = new Car(10000, "Red", "Audi");
		
		System.out.println(c.hashCode());
		System.out.println(c.toString());
		
		Car c1 = new Car(15000, "Blue", "BMW");
		
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
		
		Car c2 = new Car(20000, "White","Benz");
		
		System.out.println(c2.hashCode());
		System.out.println(c2.toString());
	}
}
