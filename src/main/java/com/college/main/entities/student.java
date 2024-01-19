package com.college.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="collegestudent")
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int studentid;
	private String studentname;
	private String studentaddress;
	private String studentph;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getStudentph() {
		return studentph;
	}
	public void setStudentph(String studentph) {
		this.studentph = studentph;
	}
	

}
