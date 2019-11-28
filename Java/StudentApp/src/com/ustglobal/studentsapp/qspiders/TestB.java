package com.ustglobal.studentsapp.qspiders;

import static com.ustglobal.studentsapp.jspiders.Remote.*;
import com.ustglobal.studentsapp.jspiders.Remote;

public class TestB {
	
	public static void main(String[] args) {
		on();
		System.out.println(num);
		
		off();
		Remote r = new Remote();
		System.out.println(r.sum);
	}

}
