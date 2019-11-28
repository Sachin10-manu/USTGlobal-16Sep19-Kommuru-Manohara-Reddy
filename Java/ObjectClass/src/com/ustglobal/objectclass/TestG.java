package com.ustglobal.objectclass;

public class TestG {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Manu", 50000);
		Employee e2 = new Employee(2, "siri", 20000);
		Employee e3 = new Employee(1, "Manu", 50000);
		Employee e4 = e2;
		
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
		
	}
}
