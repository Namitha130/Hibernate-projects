package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTestCustomer {

	public static void main(String[] args) 
	{
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("krishna");
		customer.setAge(24);
		customer.setGender("male");
		customer.setPhno(9532588997l);
		customer.setEmail("krishna23@gmail.com");
		
		
		Customer customer1 = new Customer();
		customer1.setId(102);
		customer1.setName("lakshmi");
		customer1.setAge(22);
		customer1.setGender("female");
		customer1.setPhno(8456258899l);
		customer1.setEmail("lakshmi22@gmail.com");
		
		Customer customer2 = new Customer();
		customer2.setId(103);
		customer2.setName("Manohar");
		customer2.setAge(26);
		customer2.setGender("male");
		customer2.setPhno(84562228899l);
		customer2.setEmail("Manohar22@gmail.com");
		
		Customer customer3 = new Customer();
		customer3.setId(104);
		customer3.setName("Maha Lakshmi");
		customer3.setAge(22);
		customer3.setGender("female");
		customer3.setPhno(8456258899l);
		customer3.setEmail("MahaLakshmi22@gmail.com");
		
		Customer customer4 = new Customer();
		customer4.setId(105);
		customer4.setName("Govinda");
		customer4.setAge(34);
		customer4.setGender("male");
		customer4.setPhno(8333258899l);
		customer4.setEmail("Govinda34@gmail.com");
		
		entitytransaction.begin();
		entitymanager.persist(customer);
		entitymanager.persist(customer1);
		entitymanager.persist(customer2);
		entitymanager.persist(customer3);
		entitymanager.persist(customer4);
		entitytransaction.commit();
	}

}
