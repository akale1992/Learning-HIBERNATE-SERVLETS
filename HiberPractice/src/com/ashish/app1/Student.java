package com.ashish.app1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.dialect.MySQL5Dialect;

@Entity
@Table(name ="student_table")
public class Student {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+fname+" "+lname;
	}
	

}
