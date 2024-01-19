package com.college.main.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class college {
	@Id
	private int collegeid;
	private String collegename;
	private  String collegeaddress;
	@OneToMany(cascade = CascadeType.ALL,targetEntity = student.class)
	@JoinColumn(name="collegeid", referencedColumnName = "collegeid")
	private List<student> list;
	@OneToMany(cascade = CascadeType.ALL,targetEntity = department.class)
	@JoinColumn(name="collegeid", referencedColumnName = "collegeid")
	private List<department> department;
	public List<department> getDepartment() {
		return department;
	}
	public void setDepartment(List<department> department) {
		this.department = department;
	}
	public List<student> getList() {
		return list;
	}
	public void setList(List<student> list) {
		this.list = list;
	}
	public int getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(int collegeid) {
		this.collegeid = collegeid;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCollegeaddress() {
		return collegeaddress;
	}
	public void setCollegeaddress(String collegeaddress) {
		this.collegeaddress = collegeaddress;
	}
	

}
