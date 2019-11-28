package com.ustglobal.java8predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		Predicate<Employee> p = e -> {
			if(e.Salary>50000) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee e = new Employee(1, "Manu", 85000);
		System.out.println(p.test(e));
	}
}
