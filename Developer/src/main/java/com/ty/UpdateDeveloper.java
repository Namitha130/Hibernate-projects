package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDeveloper {

	public static void main(String[] args) {
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager EntityManager =EntityManagerFactory.createEntityManager();
		EntityTransaction EntityTransaction = EntityManager.getTransaction();
		
		Developer developer = EntityManager.find(Developer.class,4 );
		developer.setExperience("5years");
		developer.setName("Narayan");
		developer.setCompanyCode("Info7896");
		EntityTransaction.begin();
		EntityManager.merge(developer);
		EntityTransaction.commit();
	}

}
