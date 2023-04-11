package edu.qsp.emp.dto;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard {
	@Id
			private String phno;
			private String address;
			private long mobileno;
			
			
			@Override
			public String toString() {
				return "Pancard [phno=" + phno + ", address=" + address + ", mobileno=" + mobileno + "]";
			}
			public String getPhno() {
				return phno;
			}
			public void setPhno(String phno) {
				this.phno = phno;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public long getMobileno() {
				return mobileno;
			}
			public void setMobileno(long mobileno) {
				this.mobileno = mobileno;
			}
}
