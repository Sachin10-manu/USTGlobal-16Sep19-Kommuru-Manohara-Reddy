package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		System.out.println("Hash code is "+p.hashCode());
		
		Pen q = new Pen();
		System.out.println("Hash code is "+q.hashCode());
	}
}
