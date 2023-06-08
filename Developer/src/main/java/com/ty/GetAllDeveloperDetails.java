package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllDeveloperDetails {

	public static void main(String[] args) {
		EntityManagerFactory EntityManagerFactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager EntityManager =EntityManagerFactory.createEntityManager();
		
		Query query =EntityManager.createQuery("Select d from Developer d where d.phno =?1 and d.experience =?2");
		query.setParameter(1, 8123578130l);
		query.setParameter(2,"5years");
		List<Developer> developers= query.getResultList();
		
		for (Developer developer : developers) 
		{
			System.out.println("Developer id is : " + developer.getId());
			System.out.println("Developer emp name is : " + developer.getName());
			System.out.println("Developer age is : " + developer.getAge());
			System.out.println("Developer phno is: " + developer.getPhno());
			System.out.println("Developer exp is: " + developer.getExperience());
			System.out.println("Developer company code is : " + developer.getCompanyCode());
			System.out.println();
		}
			
			

	}

}
