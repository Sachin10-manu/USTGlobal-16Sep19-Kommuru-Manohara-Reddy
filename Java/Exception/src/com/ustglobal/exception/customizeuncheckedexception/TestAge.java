package com.ustglobal.exception.customizeuncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		Validator v = new Validator();
		try {
		v.verify(20);
		}catch(InvalidAgeException a) {
			System.out.println("Exception occured");
		}
		
		v.verify(13);
		System.out.println("Main ended");
	}

}
