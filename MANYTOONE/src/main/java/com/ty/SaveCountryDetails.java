package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCountryDetails {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("namitha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		State state1=new State();
		state1.setState_name("Karnataka");
		state1.setCM("Basavaraj Bommai");
		state1.setCapital("Bangalore");
		state1.setLanguage("kannada");
		
		State state2=new State();
		state2.setState_name("Tamilnadu");
		state2.setCM("MK stalin");
		state2.setCapital("Chennai");
		state2.setLanguage("Tamil");
		
		State state3=new State();
		state3.setState_name("Kerala");
		state3.setCM("Pinarayi Vijayan");
		state3.setCapital("Thiruvanantharuparam");
		state3.setLanguage("Malayalam");
		
		State state4=new State();
		state4.setState_name("Andra pradesh");
		state4.setCM("YS jagan Mohan Reddy");
		state4.setCapital("Hyderabad");
		state4.setLanguage("Telugu");
		
		Country country1 =new Country();
		country1.setCountry_name("India");
		country1.setPM("Narendra modi");
		country1.setCapital("Delhi");
		
		
		
		state1.setCountries(country1);
		state2.setCountries(country1);
		state3.setCountries(country1);
		state4.setCountries(country1);
		
		
		entityTransaction.begin();
		entityManager.persist(state1);
		entityManager.persist(state2);
		entityManager.persist(state3);
		entityManager.persist(state4);
		entityManager.persist(country1);
		entityTransaction.commit();
	}

}
