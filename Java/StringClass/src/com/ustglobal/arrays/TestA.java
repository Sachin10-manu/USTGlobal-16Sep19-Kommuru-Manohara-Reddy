package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("=====================");
		
		for(int i : num) {
			System.out.println(i);
		}
		System.out.println("=====================");
		
		char[] ch = {'a','b','c','d'};
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		for(char c : ch) {
			System.out.println(c);
		}
		boolean[] b = {true,false,true,false,false,true};
		for(int i = 0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("=====================");
		
		for(boolean c : b) {
			System.out.println(c);
		}
		
		double[] d = {1.0,2.0,3.0,4.0};
		for(int i = 0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("=====================");
		
		for(double d1 : d) {
			System.out.println(d1);
		}
		String[] str = {"Manu","Reddy","Sai"};
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("=====================");
		
		
	}
}
