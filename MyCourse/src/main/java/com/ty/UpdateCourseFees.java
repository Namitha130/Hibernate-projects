package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCourseFees {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		Course course = entitymanager.find(Course.class, 4);
		course.setFees(50000.50);
		entitytransaction.begin();
		entitymanager.merge(course);
		entitytransaction.commit();

	}

}
