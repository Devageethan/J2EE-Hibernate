package edu.qsp.emp.workercontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import edu.qsp.emp.dto.Workers;

public class Workercontroller {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Workers w = new Workers();
        w.setAge(20);
        w.setName("Deva");
        w.setSal(50000);
        et.begin();
        em.persist(w);
        et.commit();
		System.out.println(w);
	}
}
