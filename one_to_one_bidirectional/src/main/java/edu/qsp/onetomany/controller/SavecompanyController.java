package edu.qsp.onetomany.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.qsp.onetomany.dao.CompanyDao;
import edu.qsp.onetomany.dto.Company;
import edu.qsp.onetomany.dto.Employee;

public class SavecompanyController {
	static CompanyDao companyDao = new CompanyDao();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Company company = new Company();
		company.setCompanyName("zoho");
		company.setAddress("chennai");
		Employee e1 = new Employee();
		e1.setName("Harsha");
		e1.setDesignation("developer");
		e1.setEmail("harsha123@gmail.com");
		e1.setSal(100000);
		e1.setPassword("w312345");

		Employee e2 = new Employee();
		e2.setName("Tabrez");
		e2.setDesignation("chennai");
		e2.setEmail("tab1234@gmail.com");
		e2.setPassword("345678");
		e2.setSal(89900);

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);

		company.setEmployees(employee);
		
		
		System.out.println("enter the key");
		System.out.println("1 for get the id");
		System.out.println("2 for save the data");
		System.out.println("3 for delete the id");
		System.out.println("4 for get all the data");
		int key=s.nextInt();
		
		switch (key) {
		
		case 1:
			companyDao.getCompanyById(1);
			System.out.println("data has fetch");
			break;
		case 2:
			companyDao.saveCompany(company);
			System.out.println("data has inserted");
			break;
		case 3:
			companyDao.deleteCompanybyid(1);
			System.out.println("data was deleted");
			break;
		case 4:
			companyDao.getAllcompanyDetails();
			System.out.println("data has fetch"); 
			break;
		}
		
		
	}

}
