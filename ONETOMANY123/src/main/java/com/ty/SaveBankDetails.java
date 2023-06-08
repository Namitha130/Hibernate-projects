package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBankDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("namitha");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Customer customer1 = new Customer();
		 customer1.setName("namitha");
		 customer1.setAge(24);
		 customer1.setGender("female");
		 customer1.setPhno(8123578130l);
		 
		 Customer customer2 = new Customer();
		 customer2.setName("Shivu");
		 customer2.setAge(29);
		 customer2.setGender("male");
		 customer2.setPhno(7847827813l);
		 
		 Bank bank1=new Bank();
		 bank1.setBank_name("SBI");
		 bank1.setIFSC("SBI0002345");
		 bank1.setAddress("bangalore");
		 bank1.setContact_no(678954334567l);

		 Bank bank2=new Bank();
		 bank2.setBank_name("Kotak mahendra");
		 bank2.setIFSC("KTM0002333");
		 bank2.setAddress("Chitradurga");
		 bank2.setContact_no(67777334567l);
		 
		 Bank bank3=new Bank();
		 bank3.setBank_name("CANARA");
		 bank3.setIFSC("CNR0002315");
		 bank3.setAddress("Mysore");
		 bank3.setContact_no(67895555567l);
		 
		 Bank bank4=new Bank();
		 bank4.setBank_name("ICICI");
		 bank4.setIFSC("ICICI0002300");
		 bank4.setAddress("Gulbarga");
		 bank4.setContact_no(61114334567l);
		 
		 List<Bank> list1 = new ArrayList<Bank>();
		 list1.add(bank1);
		 list1.add(bank2);
		 
		 List<Bank> list2 = new ArrayList<Bank>();
		 list2.add(bank3);
		 list2.add(bank4);
		 
		 customer1.setBanks(list1);
		 customer2.setBanks(list2);
		 
		 entityTransaction.begin();
		 entityManager.persist(customer1);
		 entityManager.persist(customer2);
		 entityManager.persist(bank4);
		 entityManager.persist(bank1);
		 entityManager.persist(bank2);
		 entityManager.persist(bank3);
		 entityManager.persist(bank4);
		 entityTransaction.commit();
	}

}
