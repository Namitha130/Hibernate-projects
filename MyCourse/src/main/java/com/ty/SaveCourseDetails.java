package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCourseDetails {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		Course course = new Course();
		course.setName("JAVA full stack");
		course.setFees(45000.00);
		course.setTrainer("Sumaiya taj");
		course.setDuration("8 months");
		
		Course course1 = new Course();
		course1.setName("MERN full stack");
		course1.setFees(45000.00);
		course1.setTrainer("Niranjan gowda");
		course1.setDuration("6 months");
		
		Course course2 = new Course();
		course2.setName("UI-UX Design");
		course2.setFees(45000.00);
		course2.setTrainer("Raghav ");
		course2.setDuration("6 months");
		
		Course course3 = new Course();
		course3.setName("QA testing");
		course3.setFees(45000.00);
		course3.setTrainer("Darshan patil");
		course3.setDuration("4 months");
		
		
		Course course4 = new Course();
		course4.setName("Cyber security");
		course4.setFees(45000.00);
		course4.setTrainer("keerthi prashanth");
		course4.setDuration("5 months");
		
		entitytransaction.begin();
		entitymanager.persist(course);
		entitymanager.persist(course1);
		entitymanager.persist(course2);
		entitymanager.persist(course3);
		entitymanager.persist(course4);
		entitytransaction.commit();
		

		
		

	}

}
