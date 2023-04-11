package edu.qsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.qsp.employee.dto.Employee;

public class EmployeeDao {
public Employee saveEmployee(Employee employee) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	et.begin();
	em.persist(employee);
	et.commit();
	return employee;
}
public Employee getEmployeebyId(int id) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	return em.find(Employee.class, id);
	
}
public void deleteEmployeebyid(int id) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	Employee e=em.find(Employee.class, id);
	
	et.begin();
	em.remove(e);
	et.commit();
	
	
}
public List<Employee> getAllEmployeedetails(){
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	String qurey="select e from employee e where e.id ?";
	Query q=em.createQuery(qurey);
	List<Employee> list=q.getResultList();
	return list;
	
}
}
