package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllStudentDetails {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		Query query = entitymanager.createQuery("select s from Student s where s.gender=?1");
		query.setParameter(1, "male");

		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println("student ID is : " + student.getId());
			System.out.println("student name is : " + student.getName());
			System.out.println("student age is : " + student.getAge());
			System.out.println("student gender is : " + student.getGender());
			System.out.println("student email is : " + student.getEmail());
			System.out.println("student marks is : " + student.getMarks());
			System.out.println();
		}

	}

}
