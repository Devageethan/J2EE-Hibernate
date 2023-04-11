package edu.qsp.employee.contoller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.*;

import edu.qsp.employee.dao.EmployeeDao;
import edu.qsp.employee.dto.Company;
import edu.qsp.employee.dto.Employee;

public class SavenewEmployee {
public static boolean main(String[] args) {
	EmployeeDao dao=new EmployeeDao();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Deva");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Employee emp=new Employee();
	emp.setAge(23);
	emp.setDesignation("Tester");
	emp.setName("Levi");
	emp.setPassword("4567");
	emp.setEmail("levi45@gmail.com");
	Company c=em.find(Company.class, 1);
	if(c!=null) {
		emp.setCompany(c);
		dao.saveEmployee(emp);
	}else {
		System.out.println("data not found");
	}
	return true;
}
}
