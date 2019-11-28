package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5, "vikram",56.7));
		al.add(new Student(3, "manu",46.7));
		al.add(new Student(6, "vijay",36.7));
		al.add(new Student(2, "kishan",66.7));
		al.add(new Student(1, "venkat",30.7));
		
		
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudent(al);
//		h.displayPassStudent(al);
		h.topperOfClass(al);
	}
	
}
