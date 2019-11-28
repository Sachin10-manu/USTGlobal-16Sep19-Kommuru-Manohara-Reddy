package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestO {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("girija");
		al.add("vanaja");
		al.add("jalaja");
		al.add("Manu");
		
		System.out.println("Before sort "+al);
		Collections.sort(al);
		System.out.println("After sort "+al);
	}
}
