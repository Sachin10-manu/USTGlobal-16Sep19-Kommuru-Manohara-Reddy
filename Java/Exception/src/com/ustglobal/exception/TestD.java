package com.ustglobal.exception;

public class TestD {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int[] a = {10,20,30};
		int b = 10;
		
		try {
			System.out.println(b/0);
		}
		catch(ArithmeticException ar){
			System.out.println("Number is divided by zero");
		}
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("array index not present");
		}
		
		System.out.println("Main ended");
	}
}
