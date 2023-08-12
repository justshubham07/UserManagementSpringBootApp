package com.web.spring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentinfor")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;
	private String name;
	private String email;
	public int getRollno() {
		return rollno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String email) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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

}
