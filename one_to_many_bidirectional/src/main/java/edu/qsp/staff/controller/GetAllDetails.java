package edu.qsp.staff.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllDetails {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	
	//Query q=em.createQuery("select s from Student s");
	Query q2=em.createQuery("select s from Staff s");
	List l=q2.getResultList();
	System.out.println(l);
}
}
