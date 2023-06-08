package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCourseDetails {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("namitha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Student student1=new Student();
		student1.setName("madhu");
		student1.setPhno(812345678866l);
		student1.setGender("Female");
		student1.setMarks(89);

		Student student2=new Student();
		student2.setName("madhusudhan");
		student2.setPhno(81233378866l);
		student2.setGender("male");
		student2.setMarks(90);
		
		Student student3=new Student();
		student3.setName("madhan");
		student3.setPhno(81234448866l);
		student3.setGender("male");
		student3.setMarks(99);
		
		Course course1 =new Course();
		course1.setName("MERN Stack");
		course1.setFees(60000);
		course1.setTrainer("Shubhash");
		
		Course course2 =new Course();
		course2.setName("Java Full Stack");
		course2.setFees(50000);
		course2.setTrainer("Vijay powar");
		
		Course course3 =new Course();
		course3.setName("Python Stack");
		course3.setFees(40000);
		course3.setTrainer("Isaac sir");
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(course1);
		list1.add(course2);
		list1.add(course3);
		
		List<Course> list2 = new ArrayList<Course>();
		list2.add(course1);
		list2.add(course2);
		list2.add(course3);
		
		List<Course> list3 = new ArrayList<Course>();
		list3.add(course1);
		list3.add(course2);
		list3.add(course3);
		
		student1.setSetCourses(list1);
		student2.setSetCourses(list2);
		student3.setSetCourses(list3);
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}

}
