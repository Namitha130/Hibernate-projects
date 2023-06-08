package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person1 = new Person();
		person1.setName("Megha raj");
		person1.setAge(28);
		person1.setGender("male");
		person1.setPhno(9876543257l);
		
		AdharCard adharcard1 = new AdharCard();
		adharcard1.setAdharNo(234567897654l);
		adharcard1.setAddress("Bangalore");
		
		Person person2 = new Person();
		person2.setName("Meghana");
		person2.setAge(28);
		person2.setGender("female");
		person2.setPhno(9855543257l);
		
		AdharCard adharcard2 = new AdharCard();
		adharcard2.setAdharNo(231111897654l);
		adharcard2.setAddress("Mysore");
		
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(adharcard1);
		entityManager.persist(adharcard2);
		entityTransaction.commit();
		
		
		

	}

}
