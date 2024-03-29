package com.ustglobal.jpawithhibernateapp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp1.dto.Product;
import com.ustglobal.jpawithhibernateapp1.onetoone.Person;
import com.ustglobal.jpawithhibernateapp1.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("Ram");
		
		Person p = new Person();
		p.setId(1);
		p.setName("Ram");
		p.setVotercard(vc);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
//			entityManager.persist(p);
			VoterCard vc1 = entityManager.find(VoterCard.class, 10);
			System.out.println(vc1.getPerson().getId());
			System.out.println("Record saved");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
