package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(70);
		al.add(25);
		al.add(35);
		al.add(30);
		al.add(90);
		al.add(45);

		Comparator<Integer> cmp = (m1,m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2)
			{
				return -1;
			}
			else {
				return 0;
			}
		};

		long noOfFailedStudents = al.stream().filter(i -> i < 40).count();
		System.out.println(noOfFailedStudents);
		System.out.println("=============================");
		Integer i = al.stream().min(cmp).get();
		System.out.println("Min value "+i);
		
		System.out.println("=======================");
		Integer j = al.stream().max(cmp).get();
		System.out.println("Max value "+j);
	}
}
