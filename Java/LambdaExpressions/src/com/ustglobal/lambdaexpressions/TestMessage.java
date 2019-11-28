package com.ustglobal.lambdaexpressions;

public class TestMessage {
	public static void main(String[] args) {
		GreatInterface grt = (message)->{
			System.out.println("Hello");
			System.out.println(message);
		};
	}
}
