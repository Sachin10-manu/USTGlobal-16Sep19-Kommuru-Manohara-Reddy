package com.ustglobal.mobileapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.mobileapp.dao.MobileDao;
import com.ustglobal.mobileapp.dto.Person;
import com.ustglobal.mobileapp.util.MobileFactory;

public class Mobile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("press 1 to show all contacts ");
		System.out.println("press 2 to search for contacts ");
		System.out.println("press 3 to operate on contact ");

		int m = sc.nextInt();
		switch(m) {
		case 1:
			MobileDao md = MobileFactory.getMobileDao();
			List<Person> result =  md.showAllContact();

			for(Person p : result) {
				System.out.println("Name: "+p.getName());
				
				System.out.println("==========================");
			}

			break;

		case 2:
			
//			MobileDao dao = MobileFactory.getMobileDao();
//			String name = sc.next();
//			Person b = dao.addcontact();
//			
//			System.out.println("press 1 to call");
//			System.out.println("press 2 to message");
//			System.out.println("press 3 to go back to main menu");
//			if(b!=null) {
//				
//				System.out.println("Name: "+b.getName());
//				System.out.println("Group: "+b.getGroups());
//				System.out.println("phonenumber: "+b.getPhonenumber());
//				System.out.println("==========================");
//			}else {
//				System.out.println("No data found");
//			}
			
			break;

		case 3:
			break;
		}
	}
}
