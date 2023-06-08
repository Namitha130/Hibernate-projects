package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetBasedTariner_name {

	public static void main(String[] args) 
	{
		EntityManagerFactory entitymangerfactory = Persistence.createEntityManagerFactory("namitha");
		EntityManager entitymanager = entitymangerfactory.createEntityManager();
		Query query = entitymanager.createQuery("select c from Course c where c.trainer=?1 or c.name=?2");
		query.setParameter(1, "Sumaiya taj");
		query.setParameter(2,"MERN full stack");

		List<Course> courses = query.getResultList();
		for (Course course : courses) {
			System.out.println("course id is : " + course.getId() );
			System.out.println("course name is : " + course.getName() );
			System.out.println("course Fees is : " + course.getFees() );
			System.out.println("course Trainer name is : " + course.getTrainer() );
			System.out.println("course duration is : "+ course.getDuration());
			System.out.println("*************************************************");
			
		}	

	}

}
