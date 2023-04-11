package edu.qsp.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchbasedonSalary {
	public static boolean main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	
	javax.persistence.Query q=em.createQuery("select e from Employee e where e.email=?5");
	q.setParameter(1, 10000.0);
	q.setParameter(2, 20000.0);
	java.util.List list=q.getResultList();
	System.out.println(list);
	return true;
}}
