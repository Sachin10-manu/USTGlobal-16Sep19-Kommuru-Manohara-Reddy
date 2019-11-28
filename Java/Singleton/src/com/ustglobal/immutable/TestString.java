package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		
		MyString ms = new MyString(12,"Manu");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		ms.changeContent(13, "Siri");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
	}
}
