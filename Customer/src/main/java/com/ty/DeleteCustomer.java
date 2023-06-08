package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCustomer {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		
		if(entitymanager.find(Customer.class,101)!=null) {
			Customer customer = entitymanager.find(Customer.class,101);
			entitytransaction.begin();
			entitymanager.remove(customer);
			entitytransaction.commit();
		}
		else
		{
			System.out.println("Data already deleted");
		}	
		
	}

}
