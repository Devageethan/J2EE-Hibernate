package edu.qsp.employee.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import antlr.collections.List;



public class SearchbyEmail {
		public static void main(String[] args) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
			EntityManager em=emf.createEntityManager();
			
			javax.persistence.Query q=em.createQuery("select e from Employee e where e.email=?5");
			q.setParameter(2, "nobi@gmail.com");
			java.util.List list=q.getResultList();
			System.out.println(list);
			
		}
}
