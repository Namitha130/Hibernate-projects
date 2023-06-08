package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {

	public static void main(String[] args) {
	
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		Student student = new Student();
		student.setId(106);
		student.setName("Gowri");
		student.setGender("female");
		student.setAge(23);
		student.setEmail("Gowri23@gmail.com");
		student.setMarks(98);
		
		Student student1 = new Student();
		student1.setId(102);
		student1.setName("Gowtham");
		student1.setGender("male");
		student1.setAge(25);
		student1.setEmail("Gowtham25@gmail.com");
		student1.setMarks(91);
		
		Student student2 = new Student();
		student2.setId(103);
		student2.setName("Godhaveri");
		student2.setGender("female");
		student2.setAge(23);
		student2.setEmail("Godhaveri23@gmail.com");
		student2.setMarks(89);
		
		Student student3 = new Student();
		student3.setId(104);
		student3.setName("Buveshawar");
		student3.setGender("male");
		student3.setAge(25);
		student3.setEmail("Buveshawar25@gmail.com");
		student3.setMarks(78);
		
		Student student4 = new Student();
		student4.setId(105);
		student4.setName("Saraswathi");
		student4.setGender("female");
		student4.setAge(24);
		student4.setEmail("Saraswathi24@gmail.com");
		student4.setMarks(45);
		
		entitytransaction.begin();
		entitymanager.persist(student);
		entitymanager.persist(student1);
		entitymanager.persist(student2);
		entitymanager.persist(student3);
		entitymanager.persist(student4);
		entitytransaction.commit();
	}

}
