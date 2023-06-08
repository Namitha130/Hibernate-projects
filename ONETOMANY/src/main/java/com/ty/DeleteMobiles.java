package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMobiles {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Mobile mobile = entityManager.find(Mobile.class,1);
		if(mobile != null)
		{
			Sim sim = entityManager.find(Sim.class,1);
			Sim sim1 = entityManager.find(Sim.class,2);
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityManager.remove(sim);
			entityManager.remove(sim1);
			entityTransaction.commit();
		}
		
		
		

	}

}
