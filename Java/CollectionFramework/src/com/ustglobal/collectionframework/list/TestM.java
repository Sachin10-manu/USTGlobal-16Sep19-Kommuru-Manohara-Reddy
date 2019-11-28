package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestM {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(87.6);
		al.add(12.3);
		al.add(34.5);
		al.add(null);
		
		System.out.println(al);
		al.add(2, 54.6);
		System.out.println("after add in 2nd index "+al);
		al.remove(null);
		System.out.println("after remove "+al);
		double val = al.get(4);
		System.out.println("Object at 4th index "+val);
		al.set(2, 77.6);
		System.out.println("after replacing 2nd index "+al);
		al.clear();
		System.out.println("after clear method "+al);
		boolean b = al.contains(54.6);
		System.out.println(b);
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		al.addAll(al1);
		System.out.println("after add all "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Contains all of all "+contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("Removed all of all "+res);
	}
}
