package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("iD is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("==========================");
		};
		Student s = new Student(1, "Manu", 81.78);
		c.accept(s);
		
	}
}
