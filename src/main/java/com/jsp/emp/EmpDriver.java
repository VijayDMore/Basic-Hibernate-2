package com.jsp.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmpDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Ajay");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee e1=new Employee();
		e1.setEmp_no(1);
		e1.setEname("scott");
		e1.setSal(100000);
		
		entityTransaction.begin();
		entityManager.persist(e1);
		entityTransaction.commit();
		System.out.println("All good");
	}

}
