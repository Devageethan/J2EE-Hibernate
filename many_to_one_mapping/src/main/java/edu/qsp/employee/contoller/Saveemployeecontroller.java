package edu.qsp.employee.contoller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.qsp.employee.dao.EmployeeDao;
import edu.qsp.employee.dao.SearchbasedonSalary;
import edu.qsp.employee.dto.Company;
import edu.qsp.employee.dto.Employee;

public class Saveemployeecontroller {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the key");
		System.out.println("1 for get the id");
		System.out.println("2 for save the data");
		System.out.println("3 for delete the id");
		System.out.println("4 for get all the data");
		System.out.println("5 for add new Employee");
		System.out.println("6 for search based on salary");
		System.out.println("7 for search based on email");
		int key = s.nextInt();
		EmployeeDao ed = new EmployeeDao();
		switch (key) {
		case 1:

			System.out.println(ed.getEmployeebyId(1));
			;
			System.out.println("data has fetch");
			break;
		case 2:
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Deva");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			Employee e = new Employee();
			e.setAge(22);
			e.setEmail("dj123@gmail.com");
			e.setDesignation("Developer");
			e.setName("Devageethan");
			e.setPassword("12345");
			Employee e1 = new Employee();
			e1.setAge(22);
			e1.setDesignation("Developer");
			e1.setEmail("nobi@gmail.com");
			e1.setName("Nobi");
			e1.setPassword("12398");

			Company c = new Company();
			c.setLocation("chennai");
			c.setName("TCS");

			e.setCompany(c);
			e1.setCompany(c);

			et.begin();
			em.persist(e);
			em.persist(e1);
			em.persist(c);
			et.commit();
			System.out.println("data was saved");
			break;
		case 3:
			ed.deleteEmployeebyid(1);
			System.out.println("data has deleted");
			break;
		case 4:
			System.out.println(ed.getAllEmployeedetails());
			break;
		case 5:
			System.out.print(SavenewEmployee.main(args));
			System.out.println("\n"+"data has inserted");
		case 6:
			System.out.println(SearchbasedonSalary.main(args));
			System.out.println();
			System.out.println("data has fecthed");
		case 7:
			
		}

	}

}
