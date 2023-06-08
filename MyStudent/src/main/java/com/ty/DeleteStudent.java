package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent {

	public static void main(String[] args) 
	{
		
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		 Student student = entitymanager.find(Student.class, 101);
		 
		 if(student !=null) {
				
				entitytransaction.begin();
				entitymanager.remove(student);
				entitytransaction.commit();
				System.out.println("student details is deleted");
			}
			else
			{
				System.out.println("student details is already deleted");
			}	
	}

}
