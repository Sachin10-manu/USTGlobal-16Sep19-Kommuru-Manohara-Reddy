package com.ustglobal.studentsapp.qspiders;

//import com.ustglobal.studentsapp.jspiders.Angular;
//import com.ustglobal.studentsapp.jspiders.React;

import com.ustglobal.studentsapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
		Angular a = new Angular();
		a.teachAngular();
		
		React r = new React();
		r.teachReact();
	}
}
