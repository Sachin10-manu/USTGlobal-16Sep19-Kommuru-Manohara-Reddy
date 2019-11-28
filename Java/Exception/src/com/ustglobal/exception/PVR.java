package com.ustglobal.exception;

public class PVR {

	void book() {
		System.out.println("Booking started");

		try {
			System.out.println(10/0);
			System.out.println("Logic for booking");
			System.out.println("booking confirmed");

		}catch(ArithmeticException ae) {
			System.out.println("Booking failed");
			throw ae;
		}
	}

}
