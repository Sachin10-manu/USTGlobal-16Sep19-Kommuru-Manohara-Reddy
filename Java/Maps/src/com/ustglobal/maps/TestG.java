package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Manu", 85000);
		Employee e2 = new Employee(2, "Siri", 50000);
		Employee e3 = new Employee(3, "Sai", 75000);
		Employee e4 = new Employee(4, "Hima", 65000);
		Employee e5 = new Employee(5, "Naveen", 55000);
		Employee e6 = new Employee(6, "Mani", 45000);
		Employee e7 = new Employee(7, "Hames", 35000);
		Employee e8 = new Employee(8, "Manoj", 25000);
		Employee e9 = new Employee(9, "Mahesh", 15000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<Integer, ArrayList<Employee>> hm = new HashMap<>();
		hm.put(1, al);
		hm.put(2, al1);
		hm.put(3, al2);
		
		ArrayList<Employee> ms = hm.get(2);
		
		Iterator<Employee> it = ms.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Nmae is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("++++++++++++++++++++++++");
		}
	}
}
