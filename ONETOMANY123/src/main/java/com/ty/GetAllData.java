package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("namitha");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select c from Customer c where c.phno =?1");
		query.setParameter(1, 8123578130l);
		List<Customer> customers = query.getResultList();
		for( Customer customer :customers)
		{
			System.out.println("customer name: "+ customer.getName());
			
			List<Bank> banks = customer.getBanks();
			
			for(Bank bank:banks)
			{
				System.out.println("bank name : "+ bank.getBank_name());
			}
			
		}

	}

}
