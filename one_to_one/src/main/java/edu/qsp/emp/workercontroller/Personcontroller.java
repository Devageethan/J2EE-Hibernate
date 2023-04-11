package edu.qsp.emp.workercontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.emp.dao.PersonDao;
import edu.qsp.emp.dto.Pancard;
import edu.qsp.emp.dto.Person;

public class Personcontroller {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person p=new Person();
		
		p.setAge(23);
		p.setEmail("deva@1234gmail.com");
		p.setName("deva");
		p.setAge(21);
		p.setEmail("ghmaaa123@gmail.com");
		p.setName("kevin");
	
		Pancard pan=new Pancard();
		pan.setAddress("rcs road,tirupathur");
		pan.setMobileno(899765534);
		pan.setPhno("FAH123412");
		pan.setAddress("chennai");
		pan.setMobileno(987655432);
		pan.setPhno("HG6543789");
		p.setP(pan);
		PersonDao pd=new PersonDao();
		pd.savePerson(p);
		et.begin();
		em.persist(pd);
		et.commit();
		
		
	}
}
