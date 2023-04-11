package edu.qsp.emp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.emp.dto.Pancard;
import edu.qsp.emp.dto.Person;

public class PersonDao {
	public Person savePerson(Person p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Pancard pan=p.getP();
		et.begin();
		em.persist(p);
		et.commit();
		return p;
		
	}
	public Person getPersonbyId(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		EntityManager em = emf.createEntityManager();
		
		return em.find(Person.class, 1);
		
	}
	public void deleteByid(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p=em.find(Person.class, 1);
		
		et.begin();
		em.remove(p);
		et.commit();
		
	}
}
