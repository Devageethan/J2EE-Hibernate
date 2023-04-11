package edu.qsp.staff.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student_table")
public class Student {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int sid;
private String sname;
private String branch;
private int age;
@ManyToOne
@JoinColumn
private Staff staff;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Staff getStaff() {
	return staff;
}
public void setStaff(Staff staff) {
	this.staff = staff;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", branch=" + branch + ", age=" + age +  "]";
}


}
