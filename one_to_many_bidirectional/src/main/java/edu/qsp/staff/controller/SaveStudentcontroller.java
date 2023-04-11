package edu.qsp.staff.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.staff.dto.Staff;
import edu.qsp.staff.dto.Student;

public class SaveStudentcontroller {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setAge(22);
	s1.setBranch("Biology");
	s1.setSname("Deva");
	Student s2=new Student();
	s2.setAge(23);
	s2.setBranch("Biology");
	s2.setSname("Dinesh");
	List<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	Staff s=new Staff();
	s.setName("GG");
	s.setSubject("Biology");
		
	s.setStudent(al);
	s1.setStaff(s);
	s2.setStaff(s);
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(s);
	et.commit();
	
}
}
