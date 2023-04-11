package edu.qsp.emp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
			private int id;
			private String name;
			private String email;
			private int age;
			@OneToOne
			
			Pancard p;
			
			
			public Pancard getP() {
				return p;
			}
			public void setP(Pancard p) {
				this.p = p;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			@Override
			public String toString() {
				return "Person [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
			}
			
			
}
