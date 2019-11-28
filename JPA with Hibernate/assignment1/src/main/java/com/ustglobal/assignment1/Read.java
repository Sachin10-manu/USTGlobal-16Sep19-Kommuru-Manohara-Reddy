package com.ustglobal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Student;

public class Read {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manu");
		EntityManager em = emf.createEntityManager();
		Student s = em.find(Student.class, 1);
		System.out.println("Id: "+s.getSid());
		System.out.println("Name: "+s.getSname());
		System.out.println("Marks: "+s.getMarks());
	}
	
}
