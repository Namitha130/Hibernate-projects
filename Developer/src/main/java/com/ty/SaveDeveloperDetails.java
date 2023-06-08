package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDeveloperDetails {

	public static void main(String[] args) {
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager EntityManager =EntityManagerFactory.createEntityManager();
		EntityTransaction EntityTransaction = EntityManager.getTransaction();
		
		Developer developer = new Developer();
		developer.setName("MadhuRani");
		developer.setAge(23);
		developer.setGender("female");
		developer.setPhno(8987654342l);
		developer.setExperience("3years");
		developer.setCompanyCode("TCS2345");
		
		Developer developer1 = new Developer();
		developer1.setName("MadhuRani");
		developer1.setAge(23);
		developer1.setGender("female");
		developer1.setPhno(8123578130l);
		developer1.setExperience("3years");
		developer1.setCompanyCode("TCS2345");
		
		Developer developer2 = new Developer();
		developer2.setName("MadhuRani");
		developer2.setAge(23);
		developer2.setGender("female");
		developer2.setPhno(9448664895l);
		developer2.setExperience("3years");
		developer2.setCompanyCode("TCS2345");
		
		Developer developer3 = new Developer();
		developer3.setName("MadhuRani");
		developer3.setAge(23);
		developer3.setGender("female");
		developer3.setPhno(7847827813l);
		developer3.setExperience("3years");
		developer3.setCompanyCode("TCS2345");
		
	
		EntityTransaction.begin();
		EntityManager.persist(developer);
		EntityManager.persist(developer1);
		EntityManager.persist(developer2);
		EntityManager.persist(developer3);
		EntityTransaction.commit();
	}

}
