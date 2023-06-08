package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudentsDetails {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		Student student = entitymanager.find(Student.class, 102);
		
		System.out.println("student ID is : " + student.getId());
		System.out.println("student name is : " + student.getName());
		System.out.println("student age is : " + student.getAge());
		System.out.println("student gender is : " + student.getGender());
		System.out.println("student email is : " + student.getEmail());
		System.out.println("student marks is : " + student.getMarks());
	}

}
