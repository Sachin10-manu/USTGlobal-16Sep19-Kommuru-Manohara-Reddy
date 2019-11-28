package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(10, "Manu", 95.50);
		System.out.println(s.hashCode());
		System.out.println(s.toString());
	}
}
