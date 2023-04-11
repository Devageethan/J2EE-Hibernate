package edu.qsp.onetomany.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import edu.qsp.onetomany.dto.Company;

public class CompanyDao {
		public Company saveCompany(Company company) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			et.begin();
			em.persist(company);
			et.commit();
			return company;
			
		}
		public Company getCompanyById(int id) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
			EntityManager em=emf.createEntityManager();
			return em.find(Company.class, id);
			
		}
		public void deleteCompanybyid(int id) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			Company company=em.find(Company.class, id);
			et.begin();
			em.persist(company);
			et.commit();
		}
		public List<Company> getAllcompanyDetails(){
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
			EntityManager em=emf.createEntityManager();
			javax.persistence.Query query=em.createQuery("select c from Company c");
			return query.getResultList();
			
		}
}
