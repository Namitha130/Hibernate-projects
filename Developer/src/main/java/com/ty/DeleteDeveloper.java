package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDeveloper {

	public static void main(String[] args) {
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager EntityManager =EntityManagerFactory.createEntityManager();
		EntityTransaction EntityTransaction = EntityManager.getTransaction();
		
		Developer developer = EntityManager.find(Developer.class,5);
		if(developer != null)
		{
			EntityTransaction .begin();
			EntityManager.remove(developer);
			EntityTransaction .commit();
			System.out.println("Employee details is deleted");
		}
		else {
			System.out.println("Employee details is already deleted");
		}
		
	}

}
